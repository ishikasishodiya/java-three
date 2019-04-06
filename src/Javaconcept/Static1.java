package Javaconcept;

public class Static1 {
	int rollno;
	String name;
	static String college ="upes";
	Static1(int x, String y){
		rollno=x;
		name=y;
		}
void show() {
	System.out.println(rollno +" "+ name +" "+ college);
}
	public static void main(String[] args) {
		 Static1 a = new  Static1(12,"ishu");
		 a.show();
		 Static1 b = new  Static1(14,"aayu");
		 b.show();

	}

}
