package com.spring.shop.dao;

import java.util.List;

import com.spring.shop.vo.MemberVO;

public interface MemberDAO {
	public List<MemberVO> memberList();
	
	//회원가입
	public void insertMember(MemberVO vo) throws Exception;
	
	// 로그인
	public MemberVO login(MemberVO vo) throws Exception;
	
	
	public void edit(MemberVO vo) throws Exception;

}
