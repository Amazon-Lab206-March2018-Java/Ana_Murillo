package com.anaroja.license.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="licenses")
public class License {
    
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String number;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date expiration_date;
    private String state;
    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="person_id")
    private Person person;
    
    @PrePersist
	protected void onCreate(){
		this.createdAt = new Date();
	 }
	 @PreUpdate
	 protected void onUpdate(){
		 this.updatedAt = new Date();
	}
    public License() {
        
    }
    
    public License(String number, Date expiration_date, String state, Person person) {
		this.number = number;
		this.expiration_date = expiration_date;
		this.state = state;
		this.person = person;
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
	public String getNumber() {
		return number;
	}
	//setter
	public void setNumber(String number) {
		this.number = number;
	}
	//getter
	public Date getExpiration_date() {
		return expiration_date;
	}
	//setter
	public void setExpiration_date(Date expiration_date) {
		this.expiration_date = expiration_date;
	}
	//getter
	public String getState() {
		return state;
	}
	//setter
	public void setState(String state) {
		this.state = state;
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
	public Person getPerson() {
		return person;
	}
	//setter
	public void setPerson(Person person) {
		this.person = person;
	}
    
}
