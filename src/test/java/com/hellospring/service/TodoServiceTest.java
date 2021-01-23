package com.hellospring.service;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.List;

import com.hellospring.mapper.TodoMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import static org.mockito.Mockito.when;

import com.hellospring.domain.Todo;

@SpringBootTest
public class TodoServiceTest {

//	@Mock
//	TodoMapper todoMapper;
//
//	@InjectMocks
//	TodoService todoService;

	@Autowired
	TodoService todoService;

//	@BeforeEach
//	void setup() {
//		List<Todo> ret = new ArrayList<Todo>();
//		Todo todo = new Todo();
//		ret.add(todo);
//		when(todoMapper.selectAll()).thenReturn(ret);
//	}

	@Test
	void test() {
		List<Todo> list = todoService.findTodoList();
		assertThat(list.size(), equalTo(1));
	}
}
