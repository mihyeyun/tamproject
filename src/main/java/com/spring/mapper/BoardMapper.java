package com.spring.mapper;

import java.util.List;

import com.spring.domain.BoardVO;

public interface BoardMapper {
	
	public List<BoardVO> getList();

	public void insert(BoardVO board);
	
	public BoardVO read(int bno);
	
	public void delete(BoardVO board);
	
	public void update(BoardVO board);
}
