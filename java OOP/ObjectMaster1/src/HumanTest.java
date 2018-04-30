public class HumanTest {

	public static void main(String[] args) {
		Human Stheve = new Human();
		Human Pablo = new Human();
		System.out.print("this is Stheve's health before attack: "+Stheve.getHealth());
		System.out.print("this is Pablo's health before attack: "+Pablo.getHealth());
		Stheve.attack(Pablo);
		Pablo.attack(Stheve);
		System.out.print("this is Stheve's health upon attack: "+Stheve.getHealth());
		System.out.print("this is Pablo's health upon attack: "+Pablo.getHealth());
	}

}
