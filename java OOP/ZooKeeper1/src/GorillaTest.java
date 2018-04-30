public class GorillaTest {

	public static void main(String[] args) {
		Gorilla Gorilla1 = new Gorilla();
		System.out.print(Gorilla1.getEnergyLevel());
		Gorilla1.throwSomething();
		Gorilla1.throwSomething();
		Gorilla1.throwSomething();
		System.out.print(Gorilla1.getEnergyLevel());
		Gorilla1.eatBananas();
		Gorilla1.eatBananas();
		System.out.print(Gorilla1.getEnergyLevel());
		Gorilla1.climb();
		System.out.print(Gorilla1.getEnergyLevel());
	}

}