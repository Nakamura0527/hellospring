package com.hellospring.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.hellospring.domain.User;

@Mapper

public interface UserMapper {

	@Select("SELECT username, password FROM tuser WHERE username = #{username}")
    User select(String username);

	@Insert("INSERT INTO tuser (username, password) VALUES (#{username}, #{password})")
	int insert(String username, String password);
}
