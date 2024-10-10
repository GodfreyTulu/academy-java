package com.bptn.course.teachbacks._03_week_map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Map.Entry;

public class LinkedHashMapExample {
	
	/*
	 * LinkedHashMap preserves insertion order
	 * It is best when the order of the key-value pairs is essential.
	 * 
	 * A Map can’t be traversed, so if you need to do so, you must first convert it into a 
	 * Set using the keySet(), entrySet(), or values() method.	 * 
	 */

    public static void main(String[] args) {
    	
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        
        // Adding elements
        linkedHashMap.put("Apple", 10);
        linkedHashMap.put("Banana", 20);
        linkedHashMap.put("Orange", 30);
		linkedHashMap.put("Avocado", 12);
		linkedHashMap.put("Mango", 9);
        
		System.out.println(linkedHashMap); // prints elements
		
        // Accessing elements
        System.out.println("Apple is found in basket number: " + linkedHashMap.get("Apple"));
        
        // Checking if a key exists
        System.out.println("Is there Banana?: " + linkedHashMap.containsKey("Banana"));
        
        // Removing an element
        linkedHashMap.remove("Orange");
        System.out.println(linkedHashMap);

        // Traversing and displaying elements
        
        // 1. Iterating using entrySet()

        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        
        // 2. Iterating using keySet()

        for (String key : linkedHashMap.keySet()) {
            System.out.println(key + " : " + linkedHashMap.get(key));
        }

        // 3. Iterating using Iterator

        Iterator<Entry<String, Integer>> iterator = linkedHashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());

        }

        
        System.out.println("The final elements: " + linkedHashMap);
    }
}

