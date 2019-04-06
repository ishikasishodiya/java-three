package Javaconcept;

public class Static4 {

	static int count =0;
	Static4(){
		count++;
		System.out.println(count);
	}
		public static void main(String[] args) {
			Static4 obj = new Static4();
			Static4 obj2 = new Static4();
			Static4 obj3 = new Static4();
	}

}
//using static keyword for variable value is retained.