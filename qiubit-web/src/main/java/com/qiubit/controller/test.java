package com.qiubit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class test {
	private final Logger logger = LoggerFactory.getLogger(test.class);

	/**
	 * 登录跳转 https://www.jianshu.com/p/8d2cc7207fb2
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/admin/login")
	public String loginGet(Model model) {
		logger.info("kais kais ");
		return "login";
	}
}
