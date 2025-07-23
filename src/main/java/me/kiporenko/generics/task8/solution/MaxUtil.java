package me.kiporenko.generics.task8.solution;

import java.util.List;

public class MaxUtil {
	public static <T extends Comparable<T>> T max(List<T> list) {
		if (list == null || list.isEmpty()) {
			throw new IllegalArgumentException("List must not be null or empty");
		}

		T max = list.get(0);
		for (T element : list) {
			if (element.compareTo(max) > 0) {
				max = element;
			}
		}
		return max;
	}
}
