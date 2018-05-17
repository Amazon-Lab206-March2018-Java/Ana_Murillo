package com.anaroja.DojoOverflow.services;

import java.util.List;
import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.anaroja.DojoOverflow.models.TagModel;
import com.anaroja.DojoOverflow.repositories.TagRepository;

@Service
public class TagService {
	
private TagRepository tagRepository;
	
	public TagService(TagRepository tagRepository) {
		this.tagRepository = tagRepository;
	}
	
	public List<TagModel> findAll() {
		return tagRepository.findAll();
	}
	
	public void addTag(@Valid TagModel tag) {
		tagRepository.save(tag);
		
	}
	
	public TagModel findTagByTag(String subject) {
		TagModel tag = tagRepository.findByTag(subject);
		if (tag != null) {
			return tag;
		}
		return tagRepository.save(new TagModel(null, subject));
	}

}
