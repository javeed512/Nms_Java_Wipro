package threads;

public class MyThread extends Thread  { // IS A Relationship

	public static void main(String[] args) { // main-thread

		/*
		 * for (int i = 1; i <= 5; i++) {
		 * 
		 * System.out.println("main thread " + i); }
		 */
		MyThread t1 = new MyThread();
		
		t1.setName("Child Thread-1");

		System.out.println(t1);
		
		MyThread t2 = new MyThread();
		
		t2.setName("Child Thread-2");
		
		//t2.setPriority(10);

		System.out.println(t2);
		

		t1.start(); // ---> run()
		t2.start(); // ---> run()
	}

	@Override
	public void run() {

		System.out.println("run() is called to execute thread logic");

		for (int i = 1; i <= 5; i++) {

			System.out.println(Thread.currentThread().getName());
		}

	}

}
