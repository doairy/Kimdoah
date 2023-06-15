package com.spring.shop.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.shop.service.ProductService;
import com.spring.shop.vo.MemberVO;
import com.spring.shop.vo.ProductVO;

@Controller
@RequestMapping("/product/*")
public class ProductController {
	
	@Autowired
	private ProductService productService;

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	//신상품 목록 페이지로 이동
	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public void getProductNew() {
		
		logger.info("신상품 페이지 진입");
	}
		
		
	//신상품 목록 페이지로 이동
	@RequestMapping(value = "/best", method = RequestMethod.GET)
	public void getProductBest() {
		
		logger.info("베스트 상품 페이지 진입");
			
	}
	

	// 상품등록 페이지 이동
	@RequestMapping(value ="/register", method = RequestMethod.GET)
	public void getprodRegister() throws Exception {
		logger.info("상품등록 접속");
	}
	
	@RequestMapping("/register")
	public String postprodRegister(@ModelAttribute ProductVO product) throws Exception {
		productService.Product(product);
		return "redirect:/admin/index";
	}
	
	
}