package Javaconcept;
public class Constructor3 {
	int c=5;
	void hello() {
		//c=29;
		System.out.println("hello"+ c);
	}
	Constructor3(int a, int b){
	 c = a+b;
	}
	public static void main(String[] args) {
		Constructor3 obj2 = new Constructor3(8,7);
		
		System.out.println(obj2.c);
		//Constructor3 obj = new Constructor3();
		obj2.hello();
		}
	}
