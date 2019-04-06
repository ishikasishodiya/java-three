package Javaconcept;

public class Overload1 {
	static int sum(int a, int b) {
		return a+b;
	}
	static int sum(int a, int b,int c) {
		return a+b+c;
	}
	static long sum(long a,long b,long c) {
	 return a*b*c;
 }
	public static void main(String[] args) {
		System.out.println(sum(3,7));
		System.out.println(Overload1.sum(7,9,98));
	System.out.println(sum(3,7,9));
		

	}

}
