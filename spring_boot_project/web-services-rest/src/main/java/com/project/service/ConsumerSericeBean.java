package com.project.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.Consumer;
import com.project.repository.ConsumerRepository;

import antlr.collections.List;

@Service
public class ConsumerSericeBean implements ConsumerService{
	
	@Autowired
	private ConsumerRepository consumerRepository;
	
	@Override
	public Collection<Consumer> findAll(){
		Collection<Consumer> consumer = consumerRepository.findAll();
		return consumer;
		
	}
	
	public Consumer findOne(Long id){
		Consumer consumer = consumerRepository.findOne(id);
		return consumer;
		
	}
	
	@Override
		public Consumer create(Consumer consumer){
		if(consumer.getId() != null){
			return null;
		}
		Consumer savedConsumer =consumerRepository.save(consumer);
		 
		 return savedConsumer; 
	}
	
	@Override
	public Consumer update(Consumer consumer)
	{
		Consumer consumerPersisted = findOne(consumer.getId());
		if(consumerPersisted ==null){
			return null;
		}
		Consumer updatedConsumer = consumerRepository.save(consumer);
		return updatedConsumer;
	}
}
