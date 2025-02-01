package com.concurrency;

import java.time.LocalTime;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class RunnableWithThreadExecutorDemo {

	public static void main(String[] args) {

		Runnable runnableTask = () -> { // run() implementation

			try {
				TimeUnit.MILLISECONDS.sleep(1000);

				System.out.println("Current Time: " + LocalTime.now());
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		};

//ExecutorService executorService =	Executors.newSingleThreadExecutor();

		// executorService.execute(runnableTask);

		/*
		 * ExecutorService executorService = Executors.newFixedThreadPool(5);
		 * 
		 * executorService.execute(runnableTask); executorService.execute(runnableTask);
		 * executorService.execute(runnableTask); executorService.execute(runnableTask);
		 * executorService.execute(runnableTask); executorService.execute(runnableTask);
		 * executorService.execute(runnableTask); executorService.execute(runnableTask);
		 */

		ExecutorService executorService = Executors.newCachedThreadPool();

		Future<String> future = executorService.submit(runnableTask, "DONE");

		try {

			String result = future.get();

			System.out.println("Result is : " + result);

			System.out.println("Is task completed? " + future.isDone());

		} catch (InterruptedException e) { // catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}

		executorService.shutdown();

	}

}
