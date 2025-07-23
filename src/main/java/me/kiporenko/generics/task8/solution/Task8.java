package me.kiporenko.generics.task8.solution;

import java.util.Arrays;
import java.util.List;

public class Task8 {
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(5, 2, 9, 1, 3);
		List<String> strList = Arrays.asList("apple", "banana", "peach", "cherry");

		Integer maxInt = MaxUtil.max(intList);
		String maxStr = MaxUtil.max(strList);

		System.out.println("Max Integer: " + maxInt);   // Output: 9
		System.out.println("Max String: " + maxStr);    // Output: peach (lexicographically)
	}
}
