package com.bptn.course.self_and_instructor_led._03_week_practices;

import java.util.HashMap;
import java.util.Map;

public class HashMapManipulation {
	public static void main(String[] args) {
		// Create a HashMap and populate it with initial key-value pairs

		HashMap<String, Integer> map = new HashMap<>();

		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);

		// Print the size of the map
		System.out.println("Map size: " + map.size());

		// Use a for loop to print the key-value pairs in the map
		for (Map.Entry<String, Integer> entry : map.entrySet()) {

			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}

		// Use get() method to get the value of key "A"

		Integer value = map.get("A");
		System.out.println("Value of key 'A': " + value);

		// use put() method to add a new key-value pair to the map

		System.out.println("Map after adding a new key-value pair: "); // Prints the line as instructed.

		map.put("D", 4);
		for (Map.Entry<String, Integer> entry : map.entrySet()) {

			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}

		// Use the containsKey() method to check if the key "C" exists in the map

		if (map.containsKey("C")) {

			System.out.println("Key 'C' exists in the map");
		}

		else {

			System.out.println("Key 'C' does not exist in the map");
		}
	}
}