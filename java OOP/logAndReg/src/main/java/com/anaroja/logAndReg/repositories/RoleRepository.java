package com.anaroja.logAndReg.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.anaroja.logAndReg.models.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
	 List<Role> findAll();
	    
	 List<Role> findByName(String name);
}
