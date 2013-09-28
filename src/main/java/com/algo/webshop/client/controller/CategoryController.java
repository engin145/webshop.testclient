package com.algo.webshop.client.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.algo.webshop.common.domain.Category;
import com.algo.webshop.common.domainimpl.ICategory;

@Controller
public class CategoryController {
	private ICategory service;
	private Category category;

	@Autowired
	public void setUserService(@Qualifier("categoryService") ICategory service) {
		this.service = service;
	}
	
	@RequestMapping("addCategory")
	public ModelAndView addUser(Model model,HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		category = new Category();
		category.setName(request.getParameter("name"));
//		try {
			service.addCategory(category);
//		} catch (Exception e) {
//			model.addAttribute("massageCategory", "Category not create");
//			return new ModelAndView("categoryReqOp");
//		}
		model.addAttribute("massage", "Category create");
		return new ModelAndView("welcome");
	}
}
