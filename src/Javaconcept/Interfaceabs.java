package Javaconcept;
interface Ap{
	void color();
}
abstract class Bp implements Ap{
	public void color(){
		System.out.print("hello red");
		
	}
}
class Cp extends Bp{
	public void color() {
		System.out.print("hello pink");
	}
}
public class Interfaceabs {
	public static void main(String[] args)
	{
		Ap obj = new Cp();
		obj.color();
		
	}
}
