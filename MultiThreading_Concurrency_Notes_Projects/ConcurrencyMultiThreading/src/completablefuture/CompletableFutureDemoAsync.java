package completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureDemoAsync {

	public static void main(String[] args) {

		CompletableFuture<String> greetingFuture = CompletableFuture.supplyAsync(() -> {

			return "Hello World";

		});

		try {
			System.out.println(greetingFuture.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
