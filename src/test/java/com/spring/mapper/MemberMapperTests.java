package com.spring.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.domain.BoardVO;
import com.spring.domain.MemberVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class MemberMapperTests {
	
	@Autowired
	private MemberMapper memberMapper;
	
	@Test
	public void testGetMemberList() {
		log.info("----------------");
		log.info(memberMapper.getMemberList());
	}

	
	
	

	  /*@Test
	  public void testInsert() {
		  MemberVO vo = new MemberVO();
		  vo.setUserid("may123");
		  vo.setUsername("윤미혜"); 
		  vo.setUserpw("1234");
		  vo.setEmail("cloud123@naver.com");
		  vo.setGender("남");
	  
	  memberMapper.insertMember(vo); }*/
			 
	 
	 
	
	@Test
	public void testRead() {
		MemberVO vo = memberMapper.read("sky123");
		log.info(vo);
	}
	
	
	  @Test public void testDelete() { MemberVO vo = new MemberVO();
	  vo.setUserid("may123");
	  
	  memberMapper.deleteMember(vo);
	  
	  }
	  
	  @Test
	  public void testUpdate() {
		  MemberVO vo = new MemberVO();
			 vo.setUserid("sky123");
			 vo.setUsername("홍성훈");
			 vo.setUserpw("1234");
			 vo.setEmail("cloud123@naver.com");
			 vo.setGender("남");
			  
			 memberMapper.updateMember(vo); 
	  }  
}
