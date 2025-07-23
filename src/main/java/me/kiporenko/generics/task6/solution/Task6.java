package me.kiporenko.generics.task6.solution;

import java.util.*;

public class Task6 {

	public static void main(String[] args) {
		// Type inference using the diamond operator <>
		Map<String, List<Integer>> map = new HashMap<>();

		// Adding data to the map
		map.put("evens", Arrays.asList(2, 4, 6, 8));
		map.put("odds", Arrays.asList(1, 3, 5, 7));
		map.put("primes", Arrays.asList(2, 3, 5, 7));

		// Retrieving and printing the data using a loop
		for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
			System.out.println("Key: " + entry.getKey());
			System.out.println("Values: " + entry.getValue());
			System.out.println();
		}
	}
}
