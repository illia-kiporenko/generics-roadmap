package me.kiporenko.generics.task7.solution;

public interface Repository<T> {
	T findById(long id);
}
