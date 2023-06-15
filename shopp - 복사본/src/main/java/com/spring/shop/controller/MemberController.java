package com.spring.shop.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.shop.service.MemberService;
import com.spring.shop.vo.MemberVO;

@Controller
public class MemberController {
	@Inject
	MemberService memberService;
	
	@RequestMapping("member/insert")
	public String memberInsert(@ModelAttribute MemberVO vo) throws Exception {
		memberService.insertMember(vo);
		return "redirect:/member/login";
	}
	
	
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	//회원가입 페이지 이동
	@RequestMapping(value = "member/join", method = RequestMethod.GET)
	public String joinGET() {
		
		logger.info("회원가입 페이지 진입");
		return "member/join";	
	}
	
	//로그인 페이지 이동
	@RequestMapping("member/login")
	public String loginGET() {
		
		logger.info("로그인 페이지 진입");
		System.out.println("로그인페이지");
		return "member/login";
	}
	
	//회원가입 후 페이지 이동
		@RequestMapping(value = "member/join", method = RequestMethod.POST)
		public String joinPOST(MemberVO vo) throws Exception {
			logger.info("회원가입 완료");
			memberService.insertMember(vo);
			return "redirect:/";
			
		}
		
	// 로그인 데이터 사용자 -> 서버로
	@RequestMapping(value ="member/login", method = RequestMethod.POST)
	public String loginPOST(MemberVO vo, HttpServletRequest req) throws Exception {
		logger.info("로그인 데이터 전송 완료");
		HttpSession session = req.getSession();
		MemberVO login = memberService.login(vo);
		
		if(login == null) {
			session.setAttribute("member", null);
		} else {
			session.setAttribute("member", login);
		}
		return null;
		
	}
	
	// 로그아웃
	@RequestMapping(value = "member/logout", method = RequestMethod.GET)
	public String logoutGET(HttpSession session) throws Exception {
		logger.info("로그아웃 완료");
		
		memberService.logout(session);
		return "redirect:/";
	}
	
	@RequestMapping(value="admin/edit", method=RequestMethod.GET)
	public void editGET()throws Exception {
		logger.info("수정");
	}
	
	

	
	
}