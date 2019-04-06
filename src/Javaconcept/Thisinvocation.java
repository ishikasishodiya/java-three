package Javaconcept;

public class Thisinvocation {
	Thisinvocation(){
		this(34,"ishu");
		//this(34,"ishu",8);
		//System.out.print("hello");
	}
	
	Thisinvocation(int a, String s){
		System.out.println(a+s);
	}
	
	public static void main(String[] args) {
		Thisinvocation obj1 = new Thisinvocation();
		//Thisinvocation obj2 = new Thisinvocation(12,"ishika");	
	}

}
