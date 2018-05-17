package com.anaroja.DojoOverflow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.anaroja.DojoOverflow.models.TagModel;

@Repository
public interface TagRepository extends CrudRepository<TagModel, Long>{
	List<TagModel> findAll();
	TagModel findByTag(String tag);

}
