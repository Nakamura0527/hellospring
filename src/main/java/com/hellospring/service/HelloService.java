package com.hellospring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hellospring.domain.Todo;
import com.hellospring.dto.FindParameter;
import com.hellospring.mapper.TodoListMapper;
import com.hellospring.mapper.TodoMapper;

@Service
public class HelloService {

	@Autowired
	private TodoMapper todoMapper;
	@Autowired
	private TodoListMapper todoListMapper;

	public Todo getTodo(int id) {
		Todo todo = todoMapper.select(id);
		return todo;
	}

	public List<Todo> findTodoList() {
		List<Todo> list = todoMapper.selectAll();
		return list;
	}

	public List<Todo> findTodoList2() {
		FindParameter param = new FindParameter();
		param.setTitle("タイ");
		List<Todo> list = todoListMapper.selectList("タイ");
        for (Todo todo : list) {
            System.out.println("ID       : " + todo.getId());
            System.out.println("TITLE    : " + todo.getTitle());
            System.out.println("CONTENT  : " + todo.getContent());
        }
		return list;
	}
}
