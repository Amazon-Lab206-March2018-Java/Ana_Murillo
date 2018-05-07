package may4th;

public class Testing {

	public static void main(String[] args) {
		Character Darth = new Character("Darth Vader", 72, "I find your lack of faith disturbing.");
		Character Obi = new Character("Obi-Wan Kenobi", 72, "The Force will be with you. Always.");
		Character Leia = new Character("Leia Organa", 72, "Help me, Obi-Wan Kenobi. You’re my only hope.");
		
		
		Darth.sayHi(Leia);
		Obi.sayHi(Leia);
		Leia.sayHi(Darth);

	}

}
