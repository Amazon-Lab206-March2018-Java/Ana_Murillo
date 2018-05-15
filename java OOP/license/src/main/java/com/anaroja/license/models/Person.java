package com.anaroja.license.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name="persons")
public class Person {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    
	// This will not allow the createdAt column to be updated after creation
    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
    
    @OneToOne(mappedBy="person", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    private License license;
    
	@PrePersist
	protected void onCreate(){
		this.createdAt = new Date();
	 }
	 @PreUpdate
	 protected void onUpdate(){
		 this.updatedAt = new Date();
	}
    
    public Person() {
        
    }
    
    public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
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
	public String getFirstName() {
		return firstName;
	}
	//setter
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	//getter
	public String getLastName() {
		return lastName;
	}
	//setter
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	public License getLicense() {
		return license;
	}
	//setter
	public void setLicense(License license) {
		this.license = license;
	}

}

