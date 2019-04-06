package Javaconcept;

public class Constructornew {
	int a=20;
	int b=6;
	int c;
	Constructornew()
	{
		//a=20;
		//b=30;
		c=a+b;
	}
	Constructornew(int a,int b){
		c=a/b;
		
	}
	public static void main(String[] args) {
		Constructornew obj = new Constructornew();
		Constructornew obj2= new Constructornew(5,7);
		System.out.println(obj.c);
		System.out.println(obj2.c);
		

	}

}
