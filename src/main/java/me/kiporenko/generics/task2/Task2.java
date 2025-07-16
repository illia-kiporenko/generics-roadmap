package me.kiporenko.generics.task2;

public class Task2 {
	public static void main(String[] args) {
		Box<String> stringBox = new Box<>("Hello, Generics!");
		Box<Integer> intBox = new Box<>(42);

		System.out.println("String Box contains: " + stringBox.getValue());
		System.out.println("Integer Box contains: " + intBox.getValue());
	}
}

class Box<T> {
	private T value;

	public Box(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}
