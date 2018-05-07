package com.anaroja.web.models;

public class Animal {
	private String name;
	private String breed;
	private int weight;
	
	public Animal(String name, String breed, int weight) {
		this.name = name;
		this.breed = breed;
		this.weight = weight;
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
	public String getBreed() {
		return breed;
	}
	//setter
	public void setBreed(String breed) {
		this.breed = breed;
	}
	//getter
	public int getWeight() {
		return weight;
	}
	//setter
	public void setWeight(int weight) {
		this.weight = weight;
	}
	

}
