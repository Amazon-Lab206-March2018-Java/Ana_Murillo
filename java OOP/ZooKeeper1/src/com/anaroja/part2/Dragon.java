package com.anaroja.part2;

public class Dragon extends Mammal{
	public Dragon() {
		super();
	}
	public void fly(){
		System.out.println("flewwww!!!!");
		super.setEnergyLevel(super.getEnergyLevel()-50);
	}
	public void eatHumans(){
		System.out.println("nomm noomm");
		super.setEnergyLevel(super.getEnergyLevel()+25);
	}
	public void attackTown(){
		System.out.println("BOOOM!!!!!");
		super.setEnergyLevel(super.getEnergyLevel()-100);
	}
	
}