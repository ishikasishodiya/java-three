package Javaconcept;

public class Constructor {
Constructor()
{
System.out.println("default constructor called");	
}
Constructor(int a, int b)
{
	System.out.println("prametrized constructor called");
	System.out.print(a+b);
}
public static void main(String[] args) {
Constructor obj = new Constructor();
Constructor obj2 = new Constructor(10,65);
}

	}
