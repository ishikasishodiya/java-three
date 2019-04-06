package Javaconcept;
import java.util.Scanner;
class Add11{
	
	int A11(int x,int y) {
		
	return x+y;
	}
}

class Add22 extends Add11{
	int B11(int x, int y ,int z) {
		return x+y+z;
	}
}



public class Inherit5 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c =sc.nextInt();
		
		Add22 obj = new Add22();
		System.out.println(obj.A11(a, b));//way 1 to do it..call method
		//int m = obj.A11(a, b);
	//System.out.println(m);
	   int n = obj.B11(a, b, c);//way 2
	   System.out.println(n);
	}
}
