package com.restart.test;

public class exceptionDemo {

	public static void main(String[] args) {
		dostuff();
		System.out.println(10 / 0);
	}

	private static void dostuff() {
		domoreStuff();
		System.out.println("hi");

	}

	private static void domoreStuff() {

		System.out.println("Hello");
	}

}
