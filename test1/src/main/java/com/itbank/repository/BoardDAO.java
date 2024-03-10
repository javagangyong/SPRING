package com.itbank.repository;

import java.util.List;

import org.apache.ibatis.annotations.Select;


public interface BoardDAO {

	@Select("select * from board2 order by idx desc fetch next 10 rows only")
	List<BoardDTO> selectList();
}
