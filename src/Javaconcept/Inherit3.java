package Javaconcept;
class Vegetarian2{// multilevel
void A(){
System.out.println("vegggies have protien values");
}}
class Soup2 extends Vegetarian2{
void B(){
System.out.println("soup are both veg and non veg");
}
}
class Mushroom2 extends Vegetarian2{
void C(){
System.out.println("mushroom soup is veg");
}}

public class Inherit3 {

	public static void main(String[] args) {
	Soup2 obj=new Soup2();
	obj.B();
	obj.A();
	Mushroom2 obj2 =new Mushroom2();
	obj2.C();
	
	}

}
