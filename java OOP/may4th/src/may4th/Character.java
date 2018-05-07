package may4th;

public class Character {
	private String name;
	private double weight;
	private String famous_saying;
	
	public Character(String name, double weight, String famous_saying) {
		this.name = name;
		this.weight = weight;
		this.famous_saying = famous_saying;
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
	public double getWeight() {
		return weight;
	}
	//setter
	public void setWeight(double weight) {
		this.weight = weight;
	}
	//getter
	public String getFamous_saying() {
		return famous_saying;
	}
	//setter
	public void setFamous_saying(String famous_saying) {
		this.famous_saying = famous_saying;
	}
	
	public void sayHi(Character CharactersStartWars){
		System.out.println("Hello " + CharactersStartWars.getName() + ", " + "I'm " + this.name);
	}

}
