package synchronize;

public class Admission implements Runnable {

	int seats =1;
	
	public static void main(String[] args) {
		
	Runnable   admission =	  new Admission();
		
	
			Thread t1 = new Thread(admission,"raju");
			
			Thread t2 = new Thread(admission,"satish");
	

			t1.start();
			t2.start();   // priority is 5 for both
			
	}

	@Override
	public synchronized void run() {
	
		/*
		 * synchronized (this) { // we can use block to synchronized any line of code in
		 * java }
		 */
		if(seats > 0) {
		
		System.out.println("Before  no. of seats "+this.seats);
		System.out.println("Seat is allocated to : "+Thread.currentThread().getName());
		
		seats--;
		
		System.out.println("After no. of seats "+this.seats);
		}
		else {
			
			System.err.println("Sorry! try next year");
			
		}
		
	}

}
