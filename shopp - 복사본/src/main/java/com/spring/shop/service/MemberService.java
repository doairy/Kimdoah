package com.spring.shop.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.spring.shop.vo.MemberVO;

public interface MemberService {
	
	// 회원 목록 
	public List<MemberVO> memberList();
	
	// 회원가입
	public void insertMember(MemberVO vo) throws Exception;
	
	// 로그인
	public MemberVO login(MemberVO vo) throws Exception;
	
	// 로그아웃
	public void logout(HttpSession session) throws Exception;
	
	public void edit(MemberVO vo) throws Exception;
}
