package Javaconcept;

public class Static6 {
	static int cal(int x) {
		
		return(x*x*x);
	}

	public static void main(String[] args) {
	int a = Static6.cal(9);
	System.out.print(a);
//vahi parameterized function hai toh new variable a mai store karna hoga result.
	}

}
