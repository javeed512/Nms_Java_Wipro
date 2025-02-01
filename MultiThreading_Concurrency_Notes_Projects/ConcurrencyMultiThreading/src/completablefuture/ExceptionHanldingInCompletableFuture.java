package completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ExceptionHanldingInCompletableFuture {

	public static void main(String[] args)  {


		
		CompletableFuture<Integer> div = CompletableFuture.supplyAsync(() -> {
				int a=10 , b =0;
			
				System.out.println("task started...");
			return 	  a/b;
			

		}).exceptionally( e -> {  System.err.println("task fail");  return 0;} );
		
		
		try {
			System.out.println(div.get());
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ExecutionException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}


	}

}
