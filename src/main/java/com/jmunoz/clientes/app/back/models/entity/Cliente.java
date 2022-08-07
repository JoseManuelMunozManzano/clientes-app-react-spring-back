package com.jmunoz.clientes.app.back.models.entity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="clientes")
public class Cliente implements Serializable {

    @Serial
    private static final long serialVersionUID = -5761951241322090296L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotEmpty(message = "No puede estar vacío")
    @Size(min = 4, max = 20, message = "El tamaño tiene que estar entre 4 y 20 caracteres")
    private String nombre;

    @NotEmpty(message = "No puede estar vacío")
    private String apellido;

    @Column(nullable = false, unique = true)
    @NotEmpty(message = "No puede estar vacío")
    @Email(message = "No es una dirección de correo bien formada")
    private String email;

    @Column(name = "create_at")
    @Temporal(TemporalType.DATE)
    private Date createAt;

    @PrePersist
    public void prePersist() {
        createAt = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}
