package com.spring.service;

import java.util.List;

import com.spring.domain.MemberVO;

public interface MemberService {

	public List<MemberVO> getList();
	
	public void regsiter(MemberVO member);
	
	public MemberVO get(String userid);
	
	public void remove(MemberVO member);
	
	public void modify(MemberVO member);

}
