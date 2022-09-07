package com.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.domain.MemberVO;
import com.spring.mapper.MemberMapper;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
@RequiredArgsConstructor
@ToString
public class MemberServiceImpl implements MemberService {

	private final MemberMapper mapper;

	@Override
	public List<MemberVO> getList() {
		return mapper.getMemberList();
	}

	@Override
	public void regsiter(MemberVO member) {
		mapper.insertMember(member);
		
	}

	@Override
	public MemberVO get(String userid) {
		return mapper.read(userid);
	}

	@Override
	public void remove(MemberVO member) {
		mapper.deleteMember(member);
		
	}

	@Override
	public void modify(MemberVO member) {
		mapper.updateMember(member);
	}

	

}
