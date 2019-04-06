package Javaconcept;
class A12{
	private void hello() {
		System.out.println("hiii im a parent");
	}
	protected void eat() {
		System.out.println("eat fruits im parent");
	}}
	class B12 extends A12{
		 void hello() {
			System.out.println("im a child");
		
		}
		public void eat() {
			System.out.println("im a child who from protected ismade public and also ovrrrides");
		}
		
	}

 class Override2 {

	public static void main(String[] args) {
		A12 obj = new B12();
		
		obj.eat();
		
		B12 obj1 = new B12();
	obj1.hello();
	
	}

}
//we cannot call a private method