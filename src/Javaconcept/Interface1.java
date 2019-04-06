package Javaconcept;
interface Drawable{
	void draw();
		
}
class Interface1 implements Drawable {
	public void draw() {
		System.out.print("hello");
	}

	public static void main(String[] args) {
		Interface1 obj = new Interface1();
		obj.draw();

	}

	
		
}
