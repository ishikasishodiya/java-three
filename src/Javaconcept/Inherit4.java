package Javaconcept;
import java.util.Scanner;;
class Add{
	
	int A(int x,int y) {
		
	return x+y;
	}
}

class Add1 extends Add{
	int B(int x, int y ,int z) {
		return x+y+z;
	}
}


public class Inherit4 {
public static void main(String[] args) {
		Add1 obj = new Add1();
		int a; int b;
		System.out.println(obj.A(2, 3));
		//System.out.println(a);
		b = obj.B(3, 4, 7);
		System.out.print(b);
	}

}
