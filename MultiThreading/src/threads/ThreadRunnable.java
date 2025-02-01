package threads;

public class ThreadRunnable  implements  Runnable {

	public static void main(String[] args) {

		
		Runnable runnable  = new ThreadRunnable();
		
		Thread   t1  = new Thread(runnable);  // HAS A Relationship
		
		t1.setName("virat");
		System.out.println(t1);
		
		t1.start();
		
		
		Thread   t2  = new Thread(runnable,"dhoni");
		
		//t2.setName("dhoni");
		System.out.println(t2);
		t2.start();
		
	}

	@Override
	public void run() {
	
		
		System.out.println("run() is called to execute thread logic");

		for (int i = 1; i <= 5; i++) {

			System.out.println(Thread.currentThread().getName());
		}
		
	}

}
