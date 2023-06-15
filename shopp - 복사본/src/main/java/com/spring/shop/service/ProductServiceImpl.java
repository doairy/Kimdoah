package com.spring.shop.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.spring.shop.controller.AdminController;
import com.spring.shop.vo.ProductVO;

@Service

public class ProductServiceImpl implements ProductService{
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);

	
	
	

	public void Product(ProductVO product) {
		logger.info("관리자 화면 접속");
		
	}
	
	

}
