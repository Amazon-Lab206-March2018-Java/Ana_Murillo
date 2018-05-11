package com.anaroja.languages.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class language {
	@Size(min = 2, max = 20)
	private String name;
	@Size(min = 2, max = 20)
	private String creator;
	@Min (1)
	private int currentVersion;
	

	public language() {
		
	}
	
	public language(String name, String creator,int currentVersion) {
		this.creator = creator;
		this.name = name;
		this.currentVersion = currentVersion;
	}
	//getter
	public String getName() {
		return name;
	}
	//setter
	public void setName(String name) {
		this.name = name;
	}
	//getter
	public String getCreator() {
		return creator;
	}
	//setter
	public void setCreator(String creator) {
		this.creator = creator;
	}
	//getter
	public int getCurrentVersion() {
		return currentVersion;
	}
	//setter
	public void setCurrentVersion(int currentVersion) {
		this.currentVersion = currentVersion;
	}
	
}
