package me.kiporenko.generics.task4.solution;

import java.util.List;

public class Task4 {
	public static void main(String[] args) {
		List<String> stringList = List.of("a", "b", "c");
		List<Integer> intList = List.of(1, 2, 3);

		printAll(stringList);
		printAll(intList);
	}

	public static void printAll(List<?> list) {
		for (Object item : list) {
			System.out.println(item);
		}
	}
}
