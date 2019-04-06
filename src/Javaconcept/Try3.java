package Javaconcept;

import java.util.Scanner;

public class Try3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		try {
			int c=a/b;
			System.out.println(c);
			System.out.print("hi"); //this line since in try block will not run if exeption  occurs
			}
		catch(Exception e) {
			System.out.println("devide by 0 is not allowed ");
		}
		
	}

}
