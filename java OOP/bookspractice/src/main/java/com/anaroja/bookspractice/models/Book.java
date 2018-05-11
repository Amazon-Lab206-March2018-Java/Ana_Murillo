package com.anaroja.bookspractice.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class Book {
	@Size(min = 3, max = 20)
	private String title;
	
	@Size(min =5, max= 200)
	private String description;
	
	@Size(min = 3, max = 40)
	private String language;
	
	@Min(100)
	private int numberOfPages;

	public Book() {
		
	}
	
	public Book(String title, String desc, String lang, int pages) {
		this.title = title;
		this.description = desc;
		this.language = lang;
		this.numberOfPages = pages;
		
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

