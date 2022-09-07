package com.spring.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.domain.BoardVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
	
	@Autowired
	private BoardMapper boardMapper;
	
	@Test
	public void testGetList() {
		log.info("----------------");
		log.info(boardMapper.getList());
	}
	
	@Test
	public void testInsert() {
		BoardVO vo = new BoardVO();
		vo.setTitle("test 테스트");
		vo.setContent("test 콘텐츠");
		vo.setWriter("tester");
		
		boardMapper.insert(vo);
	}
	
	@Test
	public void testRead() {
		BoardVO board = boardMapper.read(1);
		log.info(board);
	}
	
	/*@Test
	public void testDelete() {
		BoardVO vo = new BoardVO();
		vo.setBno(2);
		
		boardMapper.delete(vo);
		log.info(vo);
	}*/
	
	@Test
	public void testUpdate() {
		BoardVO vo = new BoardVO();
		vo.setBno(3);
		vo.setTitle("updated Title");
		vo.setContent("updated content");
		vo.setWriter("update user00");
		
		boardMapper.update(vo);
		
		log.info(vo);
	}
}
