package com.spring.service;

import java.util.List;

import com.spring.domain.BoardVO;

public interface BoardService {
	
	public List<BoardVO> getList();
	
	public void regsiter(BoardVO board);
	
	public BoardVO get(int bno);

	public void remove(BoardVO board);
	
	public void modify(BoardVO board);

	
	
}
