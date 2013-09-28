package com.algo.webshop.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.algo.webshop.common.domain.Good;

@Controller
public class DispatcherServlet{
	
	@RequestMapping({"/","/index"})
	public String index(){
		return "index";
	}
	
	@RequestMapping("userReqOp")
	public String userReqOp(){
		return "userReqOp";
	}
	
	@RequestMapping("categoryReqOp")
	public String categoryReqOp(){
		return "categoryReqOp";
	}
	
	@RequestMapping("goodReqOp")
	public ModelAndView goodReqOp() {
		ModelAndView model = new ModelAndView("goodReqOp");
		model.getModelMap().put("goodReqOp", new Good());
		return model;
	}
}
