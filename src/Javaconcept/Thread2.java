package Javaconcept;

 class Thread2 implements Runnable{
	 public void run() {
		 System.out.print("hello");
		 
	 }

	public static void main(String[] args) {
		Thread2 obj = new Thread2();
		Thread t2 = new Thread(obj);
		t2.start();

	}

}
