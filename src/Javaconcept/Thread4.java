package Javaconcept;

 class Thread4 extends Thread{
	 public void run() {
		 for(int i =0;i<5;i++) {
			 System.out.println(Thread.currentThread().getName()+" hello 1");
			 try {// thread to sleep for 1000 milliseconds 
				 Thread.sleep(1000);
			 }
			 catch(Exception e) {
				 System.out.println(e);
			 }
		 }
	 }

	public static void main(String[] args) throws Exception {
		Thread4 obj = new Thread4();
		obj.start();
		Thread4 obj2 = new Thread4();
		obj2.start();
	}

}
