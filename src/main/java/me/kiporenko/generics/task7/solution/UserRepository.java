package me.kiporenko.generics.task7.solution;

import java.util.HashMap;
import java.util.Map;

public class UserRepository implements Repository<User> {

	private Map<Long, User> users = new HashMap<Long, User>();

	public UserRepository() {
		users.put(1L, new User(1, "Olexander"));
		users.put(2L, new User(2, "Maria"));
	}

	@Override
	public User findById(long id) {
		return users.get(id);
	}
}
