package Javaconcept;


class A{
	void a() {
		System.out.print("hi");
	}
}
class B extends A{
	void a1() {
		System.out.print("bye");
	}
}
public class Overriding {
	public static void main(String[] args) {
		A obj =new B();
		obj.a();
		A obj2 =new A();
		obj2.a();
		
}

}
