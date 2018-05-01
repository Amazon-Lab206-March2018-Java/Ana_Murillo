package com.anaroja.pokemon;

public interface PokemonInterface {
	
	static Pokemon createPokemon(String name, int health, String type) {
		Pokemon newPokemon = new Pokemon(name,health,type);
		return newPokemon;
	}
	
	static void attackPokemon(Pokemon pokemon) {
		pokemon.setHealth(pokemon.getHealth()-10);
	}
	
	static String pokemonInfo(Pokemon pokemon) {
		String health = String.valueOf(pokemon.getHealth());
		String result = "Name : "+pokemon.getName()+", Health: "+health+", Type: "+pokemon.getType();
		return result;
		
	}
}
