package com.toddenders.events_reviewer.repositories;

import org.springframework.data.repository.CrudRepository;

import com.toddenders.events_reviewer.models.User;

public interface UserRepository extends CrudRepository<User, Long>{
	User findByEmail(String email);
}
