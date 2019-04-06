package Javaconcept;

public class Static5 {
	int rollno;
	String name;
	int  b;
	static String college ="upes";
static void show1() {
	college="manipal";//static method can change the value of static variable
	
	}
Static5(int x, String y){
	rollno=x;
	name=y;
	}
void show() {
	System.out.println(rollno +" "+ name +" "+ college);
}
	public static void main(String[] args) {
		//System.out.print(b); error as static method cannot access non static variable directly.
		
		Static5.show1();//static method belong to class not object
		Static5 obj =new Static5(12,"ishu");
		Static5 obj2 =new Static5(13,"aayu");
		obj.show();
		obj2.show();
	
	}

}
