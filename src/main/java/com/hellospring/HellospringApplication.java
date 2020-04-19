package com.hellospring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import com.hellospring.domain.Todo;
import com.hellospring.mapper.TodoMapper;

@SpringBootApplication
public class HellospringApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(HellospringApplication.class, args);
	}

    private final TodoMapper todoMapper;
    public HellospringApplication(TodoMapper todoMapper) {
    	this.todoMapper = todoMapper;
    }

    @Transactional
    @Override
    public void run(String... args) throws Exception {
        Todo newTodo = new Todo();
        newTodo.setId(100);
        newTodo.setTitle("飲み会");
        newTodo.setContent("銀座 19:00");

        todoMapper.delete(newTodo.getId());

        todoMapper.insert(newTodo); // 新しいTodoをインサートする

        for (Todo todo : todoMapper.selectAll()) {
            System.out.println("ID       : " + todo.getId());
            System.out.println("TITLE    : " + todo.getTitle());
            System.out.println("CONTENT  : " + todo.getContent());
        }
    }
}
