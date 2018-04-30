package com.anaroja.parttwo;

public class Ninja extends Human {

	public Ninja() {
		this.stealth  = 10;
	}

	public void steal(Human human){
		human.setHealth(-(this.stealth));
		this.health+= this.stealth;
	}
	public void runAway(){
		this.health -= 10;
	}

}
