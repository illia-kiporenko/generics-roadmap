package me.kiporenko.generics;

import java.util.ArrayList;
import java.util.List;

public class ObjectListExample {

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

	public static void main(String[] args) {
		storeAndRetrieve();
	}
}
