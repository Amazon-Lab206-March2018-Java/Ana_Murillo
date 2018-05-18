package com.anaroja.EmployeeManager.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.anaroja.EmployeeManager.models.EMModel;
import com.anaroja.EmployeeManager.services.EMService;

@Repository
public interface EMRepository extends CrudRepository<EMModel, Long> {

	List<EMModel> findAll();
	@Query(value="SELECT * FROM Employee e WHERE firstName = ?1 AND lastName = ?2", nativeQuery=true)
	EMModel findByFullName(String fName, String sName);
	void save(EMService man1);


}
