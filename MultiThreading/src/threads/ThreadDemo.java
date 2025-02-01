package threads;

public class ThreadDemo {
	
	  public static void main(String[] args) throws InterruptedException { // main-thread
		
		  int x;
		  
		  System.out.println("main()");
		  
	ThreadDemo mt =  new ThreadDemo();
		  
		  Thread.sleep(3000);  // 3sec
		
		
		  mt.m1(4,5);
	}
	

	   public void m1(int x ,int y) {  // m1-thread
		   int a;
		   System.out.println("hello sum is "+(x+y));
		   
		  
		   
	   }
}
