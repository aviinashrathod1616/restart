package com.restart;

public class TestMain {

	public static void main(String[] args) throws InterruptedException {
		TestDemo task1 = new TestDemo(10, 20);
		Thread T1 = new Thread(task1, "T1 ");

		TestDemo task2 = new TestDemo(30, 40);
		Thread T2 = new Thread(task2, "T2 ");

		T1.start();
		T2.start();

		T1.join();
		T2.join();

		int total = task1.getResult() + task2.getResult();
		System.out.println("Total of T1 and T2 results: " + total);

	}

}
