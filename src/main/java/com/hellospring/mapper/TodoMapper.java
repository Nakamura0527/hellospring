package com.hellospring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import com.hellospring.domain.Todo;

@Mapper
public interface TodoMapper {

	@Insert("INSERT INTO todo (id, title, content) VALUES (#{id}, #{title}, #{content})")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	void insert(Todo toto);

	@Select("SELECT id, title, content FROM todo WHERE id = #{id}")
    Todo select(int id);

	@Select("SELECT id, title, content FROM todo ORDER BY id")
    List<Todo> selectAll();

	@Delete("DELETE FROM todo WHERE id = #{id}")
	void delete(int id);
}
