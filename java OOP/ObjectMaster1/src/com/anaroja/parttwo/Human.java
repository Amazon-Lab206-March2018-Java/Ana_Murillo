package com.anaroja.parttwo;

public class Human {
	protected int strength;
	protected int stealth;
	protected int intelligence;
	protected int health;
	public Human() {
		this.strength = 3;
		this.stealth = 3;
		this.intelligence = 3;
		this.health = 100;
	}
	//getter
	public int getHealth() {
		return health;
	}
	//setter
	public void setHealth(int health) {
		this.health += health;
	}
	//getter
	public int getStrength() {
		return strength;
	}
	//setter
	public void setStrength(int strength) {
		this.strength = strength;
	}
	//getter
	public int getStealth() {
		return stealth;
	}
	//setter
	public void setStealth(int stealth) {
		this.stealth = stealth;
	}
	//getter
	public int getIntelligence() {
		return intelligence;
	}
	//setter
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	
	public void attack(Human human){
		human.setHealth(-(this.strength));
	}
}
