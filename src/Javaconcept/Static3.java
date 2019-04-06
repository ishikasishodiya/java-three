package Javaconcept;

public class Static3 {
int count =0;
Static3(){
	count++;
	System.out.println(count);
}
	public static void main(String[] args) {
		Static3 obj = new Static3();
		Static3 obj2 = new Static3();
		Static3 obj3 = new Static3();
		
	}

}
//here since to call a constructor multiple times we have o create three separate objects,
//thus three times class iscalled so count is initialized to 0 three times.
//how to keep the value of count retained? see Static4.