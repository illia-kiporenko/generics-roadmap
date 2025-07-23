package me.kiporenko.generics.task3.solution;

import java.util.Arrays;
import java.util.List;

public class Task3 {
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
		List<Double> doubleList = Arrays.asList(1.5, 2.5, 3.5);

		double intSum = NumberSummer.sum(intList);
		double doubleSum = NumberSummer.sum(doubleList);

		System.out.println("Sum of integers: " + intSum);
		System.out.println("Sum of doubles: " + doubleSum);
	}
}
class NumberSummer {

	public static <T extends Number> double sum(List<T> numbers) {
		double total = 0.0;
		for (T number : numbers) {
			total += number.doubleValue();
		}
		return total;
	}
}
