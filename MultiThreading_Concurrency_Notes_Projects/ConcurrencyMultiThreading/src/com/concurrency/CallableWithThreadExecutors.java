package com.concurrency;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CallableWithThreadExecutors {

	public static void main(String[] args) {


		// Demo Callable task

				Callable<String> callableTask = () -> {
					TimeUnit.MILLISECONDS.sleep(1000);
					return "Current time :: " + LocalDateTime.now();
				};
				
				
				// Executor service instance
			ExecutorService executor = Executors.newFixedThreadPool(2);  // 2 thread completes all six tasks 
				
				
				//ExecutorService executor =		Executors.newCachedThreadPool();  // it creates 6 threads for six tasks to complete
				
	List<Callable<String>>  tasksList =			Arrays.asList(callableTask , callableTask , callableTask, callableTask , callableTask , callableTask);
				
				
								try {
									
				List<Future<String>>  results =					executor.invokeAll(tasksList);
									
							
								for (Future<String> result : results) {
									
									System.out.println("Result of Each Future from Each Task : "+result.get());
									
								}
				
					
									
									
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								} catch (ExecutionException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
	

								// Shut down the executor service
								executor.shutdownNow();
								
								
	}

}
