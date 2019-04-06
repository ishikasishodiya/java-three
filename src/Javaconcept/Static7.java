package Javaconcept;

public class Static7 {
static {
	System.out.println("static block is invoked");// static block is executed before the main 
	//method at the time of classloading
}
	public static void main(String[] args) {
		System.out.print("hello");

	}

}
