package me.kiporenko.generics.task10.solution;

import java.util.Arrays;
import java.util.List;

public class Task10 {
	public static void main(String[] args) {
		User user = new User(1, "Alice");
		ApiResponse<User> userResponse = new ApiResponse<>(user, "success");

		List<Product> products = Arrays.asList(
				new Product(101, "Laptop"),
				new Product(102, "Phone")
		);
		ApiResponse<List<Product>> productResponse = new ApiResponse<>(products, "ok");

		System.out.println(userResponse);
		System.out.println(productResponse);
	}
}
