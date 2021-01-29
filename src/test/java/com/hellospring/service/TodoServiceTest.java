package com.hellospring.service;

import com.hellospring.domain.Todo;
import com.hellospring.mapper.TodoListMapper;
import com.hellospring.mapper.TodoMapper;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@SpringBootTest
public class TodoServiceTest {

//    @Mock
//    TodoListMapper todoListMapper;
//
//    @Mock
//    TodoMapper todoMapper;
//
//    @InjectMocks
//    TodoService todoService;

    @Autowired
    TodoService todoService;

    @Test
    void TODOリストが全件検索できること_正常パターン_件数確認() {

        // テスト
        List<Todo> list = todoService.findTodoList();
//        assertThat(list.size(), not(0));
        assertThat(list.size(), is(3));
    }

    @Test
    void 指定されたタイトルで絞込検索できること_正常() {

        List<Todo> list = todoService.findTodoList("映画見る");
        assertThat(list.size(), is(1));

        list = todoService.findTodoList("ポケモン見る");
        assertThat(list.size(), is(0));
    }

    @Test
    void TODOリストのIDとタイトルが正しく取得できること_正常パターン() {
        List<Todo> list = todoService.findTodoList();
        Todo todo = list.get(0);
        assertThat(todo.getId(), is(100));
        assertThat(todo.getTitle(), is("ゲーム買う"));

        todo = list.get(1);
        assertThat(todo.getId(), is(200));
        assertThat(todo.getTitle(), is("映画見る"));

    }

}
