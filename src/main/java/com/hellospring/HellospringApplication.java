package com.hellospring;

import org.springframework.beans.factory.annotation.Autowired;
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

	@Autowired
    private TodoMapper todoMapper;

//    public HellospringApplication(TodoMapper todoMapper) {
//    	this.todoMapper = todoMapper;
//    }

	@Transactional
	@Override
	public void run(String... args) throws Exception {
		todoMapper.deleteAll();

		Todo input = new Todo();
		input.setId(100);
		input.setStatusCd("1");
		input.setTitle("ゲーム買う");
		input.setContent("どうぶつの森をAmazonで買う。");
		todoMapper.insert(input);

		input.setId(200);
		input.setStatusCd("1");
		input.setTitle("映画見る");
		input.setContent("ハリーポッターを見る。");
		todoMapper.insert(input);

		input.setId(300);
		input.setStatusCd("1");
		input.setTitle("ゲームする");
		input.setContent("買ってきたゲームをする。");
		todoMapper.insert(input);

		for (Todo todo : todoMapper.selectAll()) {
			System.out.println("ID       : " + todo.getId());
			System.out.println("TITLE    : " + todo.getTitle());
			System.out.println("CONTENT  : " + todo.getContent());
		}
	}
}
