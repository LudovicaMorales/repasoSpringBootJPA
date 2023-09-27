package com.cursoudemy.springboot.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.cursoudemy.springboot.app.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long> {
	
	
}
	
