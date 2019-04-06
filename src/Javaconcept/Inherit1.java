package Javaconcept;
class Vegetarian{ //single level inheritance
	void Veg() {
		System.out.println("Veg contains healthy protien");
		
	}
}
class Soup extends Vegetarian{
	void Mushsoup() {
		System.out.print("soup is veg");
	}
}


public class Inherit1 {

	public static void main(String[] args) {
		Soup obj = new Soup();
		obj.Veg();
		obj.Mushsoup();
		

	}

}
