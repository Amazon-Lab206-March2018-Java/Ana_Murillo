public class Gorilla extends Mammal {
	
	public Gorilla() {
		super();
	}
	public void throwSomething(){
		System.out.println("The gorilla has thrown you something");
		super.setEnergyLevel(super.getEnergyLevel()-5);
	}
	public void eatBananas(){
		System.out.println("The gorilla is eating bananas");
		super.setEnergyLevel(super.getEnergyLevel()+10);
	}
	public void climb(){
		System.out.println("The gorilla has climbed a tree!!");
		super.setEnergyLevel(super.getEnergyLevel()-10);
	}

}