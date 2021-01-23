package com.hellospring.service;

import com.hellospring.domain.Todo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import java.util.List;

@SpringBootTest
public class TodoServiceTest {

    @Autowired
    TodoService todoService;

    @Test
    void TODOリストが全件検索できること_正常パターン_件数確認() {
        List<Todo> list = todoService.findTodoList();
        assertThat(list.size(), not(0));

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
