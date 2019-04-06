package Javaconcept;

public class Constructor4 {
	static int x=0;
	int c;
	private int a=90;
	void A(int p) {
		this.a=p;
		 System.out.println(p);
	}
	static void show() {
		System.out.print("hi");
	}
	Constructor4(int a,int b){
		 c= a+b;
	}
	public static void main(String[] args) {
		//Constructor4.show();
		//Constructor4.x=90;
		
		Constructor4 obj = new Constructor4(2,6);
		obj.A(9);  
		System.out.print(obj.c);
         

	}

}