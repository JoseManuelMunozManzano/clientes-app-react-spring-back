package com.jmunoz.clientes.app.back.models.dao;

import com.jmunoz.clientes.app.back.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteDao extends CrudRepository<Cliente, Long> {

}
