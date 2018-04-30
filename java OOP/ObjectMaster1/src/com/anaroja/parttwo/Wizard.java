package com.anaroja.parttwo;

public class Wizard extends Human{
	
	public Wizard() {
		this.health = 50;
		this.health = 8;
	}

	public void heal(Human human){
		human.setHealth(this.intelligence);
	}
	public void fireball(Human human){
		human.setHealth(-(this.intelligence*3));
	}
}
