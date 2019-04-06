package Javaconcept;
abstract class A111{
	abstract void hello();
	void B121() {
		System.out.println("what is your name");
	}
}

class Main extends A111{
	void hello() {
		System.out.println("what is your name33");
	}
	
}

public class Abstarct1 {

	public static void main(String[] args) {
		Main obj =new Main();
		obj.hello();
		obj.B121();

	}

}
