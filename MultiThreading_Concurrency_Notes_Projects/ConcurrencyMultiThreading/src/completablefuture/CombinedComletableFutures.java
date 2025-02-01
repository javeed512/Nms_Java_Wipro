package completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CombinedComletableFutures {

	public static void main(String[] args) {

		CompletableFuture<String> helloFuture = CompletableFuture.supplyAsync(() -> {

			return "Hello";

		});

		CompletableFuture<String> greetingFuture = CompletableFuture.supplyAsync(() -> {

			return "World";

		});

		CompletableFuture<String> combinedFuture = helloFuture.thenCombine(greetingFuture, (m1, m2) -> {
			return m1 + " " + m2;
		});

		try {
			System.out.println(combinedFuture.get());

		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
