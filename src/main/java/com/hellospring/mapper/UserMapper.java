package com.hellospring.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.hellospring.auth.User;

@Mapper
public interface UserMapper {

    User select(String username);

	@Insert("INSERT INTO m_user (username, password) VALUES (#{username}, #{password})")
	int insert(String username, String password);
}
