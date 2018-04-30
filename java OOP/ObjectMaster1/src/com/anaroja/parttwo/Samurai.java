package com.anaroja.parttwo;

public class Samurai extends Human{
	protected int number=0;
	
	public Samurai() {
		this.health  = 200;
		number+=1;
	}
	
	public void deathBlow(Human human){
		human.health = 0;
		this.health-= this.health/2;
	}
	
	public void meditate(){
		this.health+= this.health/2;
	}
	
	public int howMany(){
		return this.number;
	}

}
