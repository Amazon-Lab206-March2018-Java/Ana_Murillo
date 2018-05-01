package com.anaroja.pokemon;

public class Pokemon {
	private String name;
	private int health;
	private String type;
	public static int pokemonCreated = 0;
	
	
	public Pokemon(String name, int health, String type) {
		this.name = name;
		this.health = health;
		this.type = type;
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
	public int getHealth() {
		return health;
	}

	//setter
	public void setHealth(int health) {
		this.health = health;
	}

	//getter
	public String getType() {
		return type;
	}

	//setter
	public void setType(String type) {
		this.type = type;
	}
	
}



