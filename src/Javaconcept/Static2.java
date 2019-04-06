package Javaconcept;

public class Static2 {
	int count=0;
	void increment() {
		count++;
		System.out.println(count);
	}
	void increment2() {
		count++;
		System.out.println(count);
	}
	void increment3() {
		count++;
		System.out.println(count);
	}
	

	public static void main(String[] args) {
		Static2 obj = new Static2();
		obj.increment();
		obj.increment2();
		obj.increment3();

	}

}
//when we write static2 obj2 =new static2() we are actually calling a class .
//since only one object is made so class is called only once .. therefore count is initialized to 0 
//only once.
