package com.toddenders.events_reviewer.services;

import org.springframework.stereotype.Service;

import com.toddenders.events_reviewer.models.Message;
import com.toddenders.events_reviewer.repositories.MessageRepo;

@Service
public class MessageService {
	
	private final MessageRepo mr;
	public MessageService(MessageRepo mr) {
		this.mr = mr;
	}
	
	public void saveMessage(Message m) {
		mr.save(m);
	}
}
