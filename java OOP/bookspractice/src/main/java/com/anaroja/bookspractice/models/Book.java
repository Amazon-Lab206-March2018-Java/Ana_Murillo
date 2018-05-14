package com.anaroja.bookspractice.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Book {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
    @Column
	@Size(min = 3, max = 20)
	private String title;
    
    @Column
	@Size(min =5, max= 200)
	private String description;
    
    @Column
	@Size(min = 3, max = 40)
	private String language;
    @Column
	@Min(100)
	private int numberOfPages;
 // This will not allow the createdAt column to be updated after creation
    @Column(updatable=false)
    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
    private Date createdAt;
    @Column
    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
    private Date updatedAt;

	public Book() {
		
	}
	
	public Book(String title, String desc, String lang, int pages) {
		this.title = title;
		this.description = desc;
		this.language = lang;
		this.numberOfPages = pages;
		
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
	public String getTitle() {
		return title;
	}
	//setter
	public void setTitle(String title) {
		this.title = title;
	}
	//getter
	public String getDescription() {
		return description;
	}
	//setter
	public void setDescription(String description) {
		this.description = description;
	}
	//getter
	public String getLanguage() {
		return language;
	}
	//setter
	public void setLanguage(String language) {
		this.language = language;
	}
	//getter
	public int getNumberOfPages() {
		return numberOfPages;
	}
	//setter
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

}

