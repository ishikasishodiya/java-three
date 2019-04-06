package Javaconcept;

public class Thread6 extends Thread{
public void run() {
	System.out.println(Thread.currentThread().getName()+" name ");
	System.out.println(Thread.currentThread().getPriority()+" priority");

}

	public static void main(String[] args) {
		Thread6 obj = new Thread6();
		Thread6 obj2 = new Thread6();
		obj.setPriority(Thread.MAX_PRIORITY);
		obj2.setPriority(Thread.MIN_PRIORITY);
		obj.start();
		obj2.start();

	}

}
