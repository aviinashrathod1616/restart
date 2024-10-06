package com.restart;

public class TestDemo implements Runnable {
	private int a;
	private int b;
	private int result;

	public TestDemo(int a, int b) {
		this.a = a;
		this.b = b;

	}

	@Override
	public void run() {
		result = a + b;
		System.out.println(Thread.currentThread().getName() + "Result : " + result);

	}

	public int getResult() {
		return result;
	}

	
}


