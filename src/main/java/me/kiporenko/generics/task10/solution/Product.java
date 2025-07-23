package me.kiporenko.generics.task10.solution;

public class Product {
	private int code;
	private String title;

	public Product(int code, String title) {
		this.code = code;
		this.title = title;
	}

	public String toString() {
		return "Product{code=" + code + ", title='" + title + "'}";
	}
}
