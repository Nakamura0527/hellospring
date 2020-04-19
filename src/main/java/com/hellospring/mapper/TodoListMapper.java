package com.hellospring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.hellospring.domain.Todo;

@Mapper
public interface TodoListMapper {

	List<Todo> selectList(@Param("title") String title);
}
