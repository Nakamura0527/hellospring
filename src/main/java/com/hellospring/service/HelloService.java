package com.hellospring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hellospring.domain.Todo;
import com.hellospring.mapper.TodoMapper;

@Service
public class HelloService {

	@Autowired
	private TodoMapper todoMapper;

	public Todo getTodo(int id) {
		Todo todo = todoMapper.select(id); // インサートしたTodoを取得して標準出力する
		return todo;
	}

	public List<Todo> findTodoList() {
		List<Todo> list = todoMapper.selectAll();
		return list;
	}
}
