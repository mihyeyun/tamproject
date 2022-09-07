package com.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.domain.BoardVO;
import com.spring.mapper.BoardMapper;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
@RequiredArgsConstructor
@ToString
public class BoardServiceImpl implements BoardService{
		
	private final BoardMapper mapper;

	@Override
	public void regsiter(BoardVO board) {	
		mapper.update(board);
	}

	@Override
	public BoardVO get(int bno) {
		return mapper.read(bno);
	}

	@Override
	public void modify(BoardVO board) {
		mapper.update(board);
	}

	@Override
	public void remove(BoardVO board) {
		mapper.delete(board);
	}

	@Override
	public List<BoardVO> getList() {
		return mapper.getList();
	}
}
