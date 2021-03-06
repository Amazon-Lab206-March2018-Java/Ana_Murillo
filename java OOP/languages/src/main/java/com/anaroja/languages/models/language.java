package com.anaroja.languages.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class language {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column
	@Size(min = 2, max = 20)
	private String name;
	
	@Column
	@Size(min = 2, max = 20)
	private String creator;
	
	@Column
	@Size(min = 1)
	private String currentVersion;
	
	// This will not allow the createdAt column to be updated after creation
    @Column(updatable=false)
    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
    private Date createdAt;
    @Column
    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
    private Date updatedAt;

	public language() {
		
	}
	
	public language(String name, String creator,String currentVersion) {
		this.creator = creator;
		this.name = name;
		this.currentVersion = currentVersion;
	}
	
	@PrePersist
	protected void onCreate(){
		this.createdAt = new Date();
	 }
	 @PreUpdate
	 protected void onUpdate(){
		 this.updatedAt = new Date();
	}
	
	//getter
	public Long getId() {
		return id;
	}
	//setter
	public void setId(Long id) {
		this.id = id;
	}
	//getter
	public Date getCreatedAt() {
		return createdAt;
	}
	//setter
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	//getter
	public Date getUpdatedAt() {
		return updatedAt;
	}
	//setter
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
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
	public String getCurrentVersion() {
		return currentVersion;
	}
	//setter
	public void setCurrentVersion(String currentVersion) {
		this.currentVersion = currentVersion;
	}
	
}
