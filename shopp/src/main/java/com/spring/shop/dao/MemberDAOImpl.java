package com.spring.shop.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.spring.shop.vo.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {
	@Inject
	private SqlSession sql;
	
	//매퍼
	private static String namespace = "member";
	
	
	@Override
	public List<MemberVO> memberList() {
		// TODO Auto-generated method stub
		return sql.selectList("member.memberList");
	}
	
	// 회원가입
	@Override
	public void insertMember(MemberVO vo) throws Exception {
		sql.insert(namespace + ".insertMember", vo);

	}
	
	// 로그인
	@Override
	public MemberVO login(MemberVO vo) throws Exception {
		return sql.selectOne(namespace + ".loginMember", vo);
	}

	// 회원정보 수정
	@Override
	public void edit(MemberVO vo) throws Exception {
		sql.update(namespace +".updateMember", vo);
		
	}
	
	
	
		


	
	

}
