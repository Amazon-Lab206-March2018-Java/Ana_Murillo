package com.toddenders.events_reviewer.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.toddenders.events_reviewer.models.Event;

public interface EventRepository extends CrudRepository<Event, Long> {
	List<Event> findByState(String state);
	List<Event> findByStateNotIn(String state);
}
