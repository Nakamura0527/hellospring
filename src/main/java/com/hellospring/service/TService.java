package com.hellospring.service;

import java.util.List;

import com.hellospring.domain.Todo;

public interface TService {

	public Todo getTodo(int id);
	public List<Todo> findTodoList();
	public List<Todo> findTodoList(String title);
	public int register(Todo todo);
}
