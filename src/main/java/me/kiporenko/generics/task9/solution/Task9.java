package me.kiporenko.generics.task9.solution;

import java.util.Arrays;
import java.util.List;

public class Task9 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "cherry");
		System.out.println("Before: " + words);

		Swapper.swapUnknown(words, 0, 2);
		System.out.println("After:  " + words);

		List<?> words2 = Arrays.asList("apple", "banana", "cherry");
		System.out.println("Before: " + words2);

		Swapper.swapUnknown(words2, 0, 2);
		System.out.println("After:  " + words2);
	}
}


class Swapper {
	public static void swapUnknown(List<?> list, int i, int j) {
		swapHelper(list, i, j);
	}

	private static <T> void swapHelper(List<T> list, int i, int j) {
		T temp = list.get(i);
		list.set(i, list.get(j));
		list.set(j, temp);
	}
}
