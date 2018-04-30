package com.anaroja.part2;

public class DragonTest {

	public static void main(String[] args) {
		Dragon Draco = new Dragon();
		System.out.print(Draco.getEnergyLevel());
		Draco.attackTown();
		Draco.attackTown();
		Draco.attackTown();
		System.out.print(Draco.getEnergyLevel());
		Draco.eatHumans();
		Draco.eatHumans();
		System.out.print(Draco.getEnergyLevel());
		Draco.fly();
		Draco.fly();
		System.out.print(Draco.getEnergyLevel());
	}

}
