package com.bptn.course.teachbacks._03_week_map;

import java.util.Map;
import java.util.TreeMap;
import java.util.Iterator;

public class TreeMapExample {
	
	/*
	 * TreeMaps are sorted by keys.
	 * 
	 */

	public static void main(String[] args) {
		Map<String, Integer> treeMap = new TreeMap<>();

		// Adding elements
		treeMap.put("Apple", 10);
		treeMap.put("Banana", 20);
		treeMap.put("Orange", 30);
		treeMap.put("Avocado", 12);
		treeMap.put("Mango", 9);

		System.out.println(treeMap); // prints elements

		// Accessing elements
		System.out.println("Apple is found in basket number: " + treeMap.get("Apple"));

		// Checking if a key exists
		System.out.println("Is there Banana?: " + treeMap.containsKey("Banana"));

		// Removing an element
		treeMap.remove("Orange");
		System.out.println(treeMap); // prints the remaining elements
		
		System.out.println("\n");

		// Traversing and displaying elements using enhanced loop and Iteration.
		// 1. Iterating using entrySet()

		for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		System.out.println("\n");

		// 2. Iterating using keySet() and get()

		for (String key : treeMap.keySet()) {
			System.out.println(key + " : " + treeMap.get(key));
		}
		
		System.out.println("\n");

		// 3. Iterating using Iterator

		Iterator<Map.Entry<String, Integer>> iterator = treeMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Integer> entry = iterator.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());

		}

		// Displaying the map after removal

		System.out.println("The final elements: " + treeMap);
	}
}
