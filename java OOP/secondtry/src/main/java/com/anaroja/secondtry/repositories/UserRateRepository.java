package com.anaroja.secondtry.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.anaroja.secondtry.models.UserRates;

@Repository
public interface UserRateRepository extends CrudRepository<UserRates, Long>{
	List<UserRates> findAll();
}
