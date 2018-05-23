package com.toddenders.events_reviewer.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.toddenders.events_reviewer.models.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
	List<Role> findAll();
    
    List<Role> findByName(String name);
}
