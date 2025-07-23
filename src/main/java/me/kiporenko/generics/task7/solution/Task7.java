package me.kiporenko.generics.task7.solution;

public class Task7 {
	public static void main(String[] args) {
		Repository<User> userRepository = new UserRepository();

		User findUser = userRepository.findById(1L);

		System.out.println("Found: " + findUser);
	}
}
