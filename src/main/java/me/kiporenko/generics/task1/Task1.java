package me.kiporenko.generics.task1;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
	public static void main(String[] args) {
		storeAndRetrieve();
		genericStoreAndRetrieve();
	}
	public static void storeAndRetrieve() {
		List list = new ArrayList(); // Raw type
		list.add("Hello");
		list.add(123); // Allowed at compile time

		// Retrieval with casting
		String str = (String) list.get(0); // OK
		System.out.println("String: " + str);

		// Runtime error! ClassCastException
		String num = (String) list.get(1);
		System.out.println("Number as String: " + num);
	}


	public static void genericStoreAndRetrieve() {
		List<String> list = new ArrayList<>();
		list.add("Hello");
		// list.add(123); // Compile-time error

		String str = list.get(0); // No casting needed
		System.out.println("String: " + str);
	}

	//Using raw types with Object is unsafe and error-prone, as incorrect types pass compile-time but fail at runtime.
	//Generics eliminate these issues by enforcing type safety during compilation, leading to more robust and readable code.
}
