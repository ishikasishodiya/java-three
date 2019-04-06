package Javaconcept;

 class Gettersetter {
	private int a;
	private int b;
	private String c;
	public void getvalue() {
		System.out.println("the value of c is"+c);
	}
	public int getvalue2() {
		return a;
	}
	
	public int getvalue3() {
		return b;
	}
	
	public void setvalue(String cc) {
		this.c= cc;
		
	}
	public void setvalue2(int aa, int bb) {
		this.a= aa;
		this.b= bb;
		
		
	}
 

}
//main method i file gettermain