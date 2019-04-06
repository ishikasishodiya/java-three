package Javaconcept;

 class Thread5 extends Thread {
	 public void run() {
		 for(int i=0;i<5;i++) {
		 System.out.println(Thread.currentThread().getName()+" hello");
			
		 }
	 }

	public static void main(String[] args) {
		Thread5 obj = new Thread5();
		obj.start();
		try {
			obj.join(1000);
			System.out.print(Thread.currentThread().getName()+" current");
			
		} catch (InterruptedException e) {
			System.out.print(e);
			}

		
	}

}
