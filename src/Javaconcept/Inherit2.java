package Javaconcept;
class Vegetarian1{// multilevel
void A(){
System.out.println("vegggies have protien values");
}}
class Soup1 extends Vegetarian1{
void B(){
System.out.println("soup are both veg and non veg");
}
}
class Mushroom extends Soup1{
void C(){
System.out.println("mushroom soup is veg");
}}
class Inherit2{
public static void main(String[] args){
Mushroom obj = new Mushroom();
obj.A();
obj.B();
obj.C();
}
}