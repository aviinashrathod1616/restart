package com.restart;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(10);

		for (int i = 0; i <= 15; i++) {
			final int taskId = i;
			executor.submit(() -> {
				System.out.println("Executing task " + taskId + " by " + Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}

			});

		}
		executor.shutdown();
	}

}
