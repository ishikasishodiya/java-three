package Javaconcept;
interface Drawable11{
	void draw11();
}
interface Show {
	void fig();
}
class Hello11 implements Show,Drawable11{
	public void draw11() {
		System.out.print("hello");
	}
	public void fig() {
		System.out.print("helloooo");
	}
}


public class Interface2 {

	public static void main(String[] args) {
		Hello11 obj = new Hello11();
		obj.draw11();
		obj.fig();

	}

}
