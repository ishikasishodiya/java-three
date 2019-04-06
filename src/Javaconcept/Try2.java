package Javaconcept;
import java.util.Scanner;
public class Try2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		try {
			int c=a/b;
			System.out.println(c);
			}
		catch(Exception e) {
			System.out.println("devide by 0 is not allowed ");
		}
		System.out.print("hi");//this code since out of try block will work no matter there is exception or not
	}

}
