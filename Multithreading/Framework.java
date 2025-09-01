package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Framework {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.submit(() -> System.out.println("Thread running via Executor"));
		executor.shutdown();
	}
}
