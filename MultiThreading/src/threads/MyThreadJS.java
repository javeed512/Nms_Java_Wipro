package threads;

public class MyThreadJS extends Thread {

	public static void main(String[] args) throws InterruptedException {// main-thread



		MyThreadJS  t1 = new MyThreadJS();
		
		t1.start();
		t1.join(6000);
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Ramu Thread");
			
		}
		
	}
	
	
	@Override
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Sathi Thread");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		
	}
	

}
