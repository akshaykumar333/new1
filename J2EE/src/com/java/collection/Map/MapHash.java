package com.java.collection.Map;

import java.util.*;
import java.util.Map.Entry;

public class MapHash {

	public static void main(String[] args) {

		Map<Integer, String> m1 = new HashMap<Integer, String>();

		m1.put(7, "Dhoni");
		m1.put(18, "kohili");
		m1.put(10, "sachin");
		m1.put(3, "raina");

		System.out.println(m1); // output values along with keys

		Map<Integer, String> m2 = new HashMap<Integer, String>();
		m2.put(1, "Smith");
		m2.put(22, "Warner");
		m2.put(2, "Maxwell");

		System.out.println(m2); // output values along with keys

		Map<Integer, String> m3 = new HashMap<Integer, String>();

		m3.putAll(m1); // copied data from m1 to m3

		System.out.println(m3);

		m3.putAll(m2); // copied data from m2 to m3

		System.out.println(m3);

		System.out.println("size of m1" + " " + m1.size());

		System.out.println("size of m3" + " " + m3.size());

		System.out.println(" m1  is empty" + " " + m1.isEmpty());

		System.out.println("key 18 in m3" + " " + m1.containsKey(18));

		System.out.println("is dhoni present in m1" + " "
				+ m1.containsValue("Dhoni")); // case sensitive

		System.out.println("value of key 7" + " " + m1.get(7));

		// A Map can't be traversed, so you need to convert it into Set using
		// keySet() or entrySet() method

		Set<Entry<Integer, String>> ref = m3.entrySet(); // must import
															// java.util.Map.Entry

		System.out.println("key" + " " + " " + "values" + " ");

		for (Entry<Integer, String> a1 : ref) // using for each loop
		{

			System.out.println(a1.getKey() + "  " + a1.getValue());

		}

		Set<Integer> s1 = m1.keySet(); // use keySet to iterate only key values
		for (Integer f1 : s1) {
			System.out.println(f1);
		}

		Collection<String> s2 = m1.values(); // iterate only values by using
												// reference of collection

		for (String f2 : s2) {
			System.out.println(f2);
		}

	}

}
