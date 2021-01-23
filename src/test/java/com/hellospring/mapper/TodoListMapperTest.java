package com.hellospring.mapper;

import com.hellospring.domain.Todo;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.test.context.TestPropertySource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.List;

@SpringBootTest
//@MybatisTest
public class TodoListMapperTest {

    @Autowired
    TodoListMapper todoListMapper;

    @Test
    void Todoリストが検索できること() {
        List<Todo> list = todoListMapper.selectList("ゲーム");
        assertThat(list.size(), is(2));
    }
}
