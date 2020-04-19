package com.hellospring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hellospring.domain.Todo;
import com.hellospring.mapper.TodoMapper;

@Component
public class HelloService {

	@Autowired
	private TodoMapper todoMapper;

	public Todo getTodo(int id) {
		Todo todo = todoMapper.select(id); // インサートしたTodoを取得して標準出力する
		return todo;
	}
}
