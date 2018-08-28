package com.qiubit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * <p>Title: IndexHomeController</p>  
 * <p>Description: 项目首页</p>  
 * Created by lirz on 2018年8月28日 
 *
 */
@Controller
@RequestMapping(value = "/", produces = { "application/JSON" })
public class IndexHomeController {

	private final Logger logger = LoggerFactory.getLogger(IndexHomeController.class);

	@RequestMapping("/index")
	public String index(Model model) {
		logger.info("访问index首页");
		return "index";
	}

}
