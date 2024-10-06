package com.restart;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class interview {

	public static void main(String[] args) {

		HashMap<String, Integer> m = new HashMap<>();
		m.put("Chiranjivi", 700);
		m.put("balaiah", 800);
		m.put("Venkatesh", 200);
		m.put("nagarjuna", 500);

		System.out.println(m);
		System.out.println(m.put("Chiranjivi", 1000));
		Set s = m.keySet();
		System.out.println("Keys : " + s);

		Collection c = m.values();
		System.out.println("Values: " + c);

		Set s1 = m.entrySet();
		System.out.println("EntrySet : " + s1);

		Iterator itr = s1.iterator();
		while (itr.hasNext()) {
			Map.Entry m1 = (Entry) itr.next();

			System.out.println(m1.getKey() + "---" + m1.getValue());

			if (m1.getKey().equals("nagarjuna")) {
				m1.setValue(10000);
			}
			System.out.println(m);
		}

	}

}
