package me.kiporenko.generics.task5.solution;

public class Task5 {

	public static <T> void reversePrint(T[] array) {
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {
		String[] stringArray = {"Java", "is", "awesome"};
		Double[] doubleArray = {1.1, 2.2, 3.3};

		System.out.println("Reversed String array:");
		reversePrint(stringArray);

		System.out.println("\nReversed Double array:");
		reversePrint(doubleArray);

		// Bonus: using the generic constructor
		new Container<>("Generic Constructor with String");
		new Container<>(12345);  // Integer
	}

}
class Container<T> {
	public Container(T value) {
		System.out.println("Value passed to generic constructor: " + value);
	}
}

