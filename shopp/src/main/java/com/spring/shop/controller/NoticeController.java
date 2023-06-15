package com.spring.shop.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class NoticeController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	//신상품 목록 페이지로 이동
	@RequestMapping(value = "notice/noticeList", method = RequestMethod.GET)
	public void getProductNew() {
		
		logger.info("공지사항 페이지 진입");
	}
		

	
}