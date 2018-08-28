package com.qiubit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/v1/rest/account")
public class AccountController {

	private final Logger logger = LoggerFactory.getLogger(AccountController.class);

	
	@GetMapping("/login")
	public String login(Model model) {
		logger.info("用户点击登陆操作");
		return "login";
	}
	
	@PostMapping("/login/userinfo")
	public String loginUserInfo(String userName,String password) {
		logger.info("userName="+userName + ",password="+password);
		return "login";
	}

	@PostMapping("/register")
	public String register(Model model) {
		logger.info("用户点击注册操作");
		return "login";
	}

}
