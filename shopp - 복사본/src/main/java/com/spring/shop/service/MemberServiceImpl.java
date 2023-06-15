package com.spring.shop.service;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.spring.shop.dao.MemberDAO;
import com.spring.shop.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {

	@Inject
	MemberDAO memberDao;
	
	@Override
	public List<MemberVO> memberList() {
		return memberDao.memberList();
	}
	
	// 회원가입
	@Override
	public void insertMember(MemberVO vo) throws Exception {
		memberDao.insertMember(vo);

	}
	
	// 로그인
	@Override
	public MemberVO login(MemberVO vo) throws Exception {
		
		return memberDao.login(vo);
	}
	
	// 로그아웃
	@Override
	public void logout(HttpSession session) throws Exception {
		session.invalidate();
		
	}

	@Override
	public void edit(MemberVO vo) throws Exception {
		memberDao.edit(vo);
		
	}
	
	
	

}
