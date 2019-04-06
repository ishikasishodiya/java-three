package Javaconcept;
//import java.lang.*; 
class Hello extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			//child thread
			System.out.println(Thread.currentThread().getName()+ " thread in control ");
			
		}
	}
}
 class Thread3 {
	 public static void main(String[] args) {
		 Hello obj = new Hello();
		 obj.start();
		 for(int j=0;j<5;j++) {
			 Thread.yield();
			 //Control passes to child thread
			 //After execution of child Thread 
	         // main thread takes over 
			 System.out.println(Thread.currentThread().getName()+ " pthread in control ");
		 }
	 }

}
