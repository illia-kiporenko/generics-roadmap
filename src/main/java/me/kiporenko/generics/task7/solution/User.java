package me.kiporenko.generics.task7.solution;

public class User {
	private int id;
	private String name;

	public User(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return "User{id=" + id + ", name='" + name + "'}";
	}
}
