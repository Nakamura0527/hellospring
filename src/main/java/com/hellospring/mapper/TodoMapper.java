package com.hellospring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.hellospring.domain.Todo;

@Mapper
public interface TodoMapper {

	/**
	 * TODO情報を登録する。
	 * @param toto TODO情報
	 */
	@Insert("INSERT INTO todo (id, title, content) VALUES (#{id}, #{title}, #{content})")
	int insert(Todo toto);

	/**
	 * TODO情報を検索する。
	 * @param id ID
	 * @return TODO情報
	 */
	@Select("SELECT id, title, content FROM todo WHERE id = #{id} ORDER BY id")
    Todo select(int id);

	/**
	 * TODO情報を全件検索する。
	 * @return TODO情報リスト
	 */
	@Select("SELECT id, title, content FROM todo ORDER BY id")
    List<Todo> selectAll();

	/**
	 * TODO情報を削除する。
	 * @param id ID
	 */
	@Delete("DELETE FROM todo WHERE id = #{id}")
	void delete(int id);

	/**
	 * TODO情報を全件削除する。
	 */
	@Delete("DELETE FROM todo")
	void deleteAll();
}
