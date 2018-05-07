package com.anaroja.web.models;

public class Dog extends Animal implements Pet{

	public Dog(String name, String breed, int weight) {
		super(name, breed, weight);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String showAffection() {
		// TODO Auto-generated method stub		
		if (super.getWeight()>30) {
			return "The dog "+super.getName()+ " is hopping in your legs";
		}
		else {
			return "The dog "+super.getName()+ " is curling up next to you";
		}
	}
}
