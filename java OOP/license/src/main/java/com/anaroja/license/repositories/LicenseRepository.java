package com.anaroja.license.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.anaroja.license.models.License;

@Repository
public interface LicenseRepository extends CrudRepository<License, Long>{
	List<License> findAll();
	Optional<License> findByPerson_id(Long id);
}
