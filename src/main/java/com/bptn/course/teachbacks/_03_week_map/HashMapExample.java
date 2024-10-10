package com.bptn.course.teachbacks._03_week_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {

	/*
	 * HashMaps are unordered.
	 * 
	 */

	public static void main(String[] args) {
		Map<String, Integer> hashMap = new HashMap<>();

		// Adding elements
		hashMap.put("Apple", 10);
		hashMap.put("Banana", 20);
		hashMap.put("Orange", 30);
		hashMap.put("Avocado", 12);
		hashMap.put("Mango", 9);
		
		System.out.println(hashMap); // prints elements

		// Accessing elements
		
		System.out.println("Apple is found in basket number: " + hashMap.get("Apple"));

		// Checking if a key exists
				
		System.out.println("Is there Banana?: " + hashMap.containsKey("Banana"));

		// Removing an element
		hashMap.remove("Orange");
		System.out.println(hashMap);

		//Traversing and displaying elements using enhanced loop and Iteration.
				
		// 1. Iterating using entrySet() - 
		for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		// 2. Iterating using keySet() and get()

		for (String key : hashMap.keySet()) {
			System.out.println(key + " : " + hashMap.get(key));
		}

		// 3. Iterating using Iterator

		Iterator<Map.Entry<String, Integer>> iterator = hashMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Integer> entry = iterator.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());

		}

		// Displaying the map after removal

			System.out.println("The final elements: " + hashMap);
		}
}
