package com.project.service;

import java.util.Collection;

import com.project.model.Consumer;

public interface ConsumerService {

	Collection<Consumer> findAll();
	
	Consumer findOne(Long id);
	
	Consumer create(Consumer consumer);
	
	Consumer update(Consumer consumer);
	 
}
