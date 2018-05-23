package com.toddenders.events_reviewer.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.toddenders.events_reviewer.models.Message;

@Repository
public interface MessageRepo extends CrudRepository<Message, Long> {
	
}
