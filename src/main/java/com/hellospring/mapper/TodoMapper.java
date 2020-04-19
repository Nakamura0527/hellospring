package com.hellospring.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import com.hellospring.domain.Todo;

@Mapper
public interface TodoMapper {

	@Insert("INSERT INTO todo (title, content) VALUES (#{title}, #{content})")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	void insert(Todo toto);

	@Select("SELECT id, title, content FROM todo WHERE id = #{id}")
    Todo select(int id);
}
