package com.restart.equals.hashcode;

import java.util.HashMap;

public class EmployeeMain {

	static Emplyee e1 = new Emplyee(101, "AVinash", 90000);
	static Emplyee e2 = new Emplyee(101, "AVinash", 90000);
	static Emplyee e3 = new Emplyee(101, "AVinash", 90000);
	static Emplyee e4 = new Emplyee(101, "AVinash", 90000);

	public static void main(String[] args) {
		HashMap<Emplyee, String> map = new HashMap<>();
		map.put(e1, "first");
		map.put(e2, "Second");
		map.put(e3, "Third");
		map.put(e4, "first");

		System.out.println(map.get(e1));

		System.out.println(map.size());

	}

}
