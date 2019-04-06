package Javaconcept;
//constructor overloading
public class Constructoroverload {
	 Constructoroverload(int a)
	{
		System.out.println(a);
		}
	Constructoroverload(int a, int b)	{
		System.out.println(a+b);
	}
	Constructoroverload(String name)
	{
		System.out.print(name);
	}
	public static void main(String[] args) {
		Constructoroverload obj = new Constructoroverload(67);
		Constructoroverload obj2 = new Constructoroverload(12,46);
		Constructoroverload obj3 = new Constructoroverload("ishika");
	}

}
