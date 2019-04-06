package Javaconcept;
import java.util.Scanner;
public class Facttrycatch {
	static int factorial(int num) {
		int fact=0;
		if(num==0)
			return 1;
		if(num<0) {
			try {
				throw new Exception("thrown");
			}
			catch(Exception e) {
				System.out.print("cant be less than 1");
			}
		}
		else
			fact = num * factorial(num-1);
		return  fact;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int result =Facttrycatch.factorial(a);
		System.out.print(result);

	}

}
