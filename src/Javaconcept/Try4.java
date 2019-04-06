package Javaconcept;

import java.util.Scanner;

public class Try4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		try {
			int c=a/b;
			System.out.println(c);
			
			}
		catch(Exception e) {
			System.out.println(a/(b+2));// we correct our exception so output aajae.
		}
		
	}

}
