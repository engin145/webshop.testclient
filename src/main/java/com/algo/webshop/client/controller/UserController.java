package com.algo.webshop.client.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.algo.webshop.common.domain.User;
import com.algo.webshop.common.domainimpl.IUser;

@Controller
public class UserController {

	private IUser service;
	
	private User user;
	
	@Autowired
	public void setUserService(@Qualifier("userService") IUser service) {
		this.service = service;
	}
	
	@RequestMapping("addUser")
	public ModelAndView addUser(Model model,HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		user = new User();
		user.setName(request.getParameter("name"));
		user.setEmail(request.getParameter("email"));
		user.setPhone(request.getParameter("phone"));
		user.setLogin(request.getParameter("login"));
		user.setPass(request.getParameter("pass"));
		try {
			service.addUserInDataBase(user);
		} catch (Exception e) {
			return new ModelAndView("userReqOp");
		}
		model.addAttribute("massage", "User create");
		return new ModelAndView("welcome");
	}
	
	@RequestMapping("getUserByLogPass")
	public ModelAndView getUserByLogPass(Model model,HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		String password = request.getParameter("pass");
		try {
			user=service.getUserByLogPass(login, password);
		} catch (Exception e) {
			return new ModelAndView("userReqOp");
		}
		model.addAttribute("massage", "Hi, "+user.getName());
		return new ModelAndView("welcome");
	}
	
	@RequestMapping("getUserById")
	public ModelAndView getUserById(Model model,HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		user=service.getUserById(id);
		model.addAttribute("massage", "Hi, "+user.getName());
		return new ModelAndView("welcome");
	}
	
	@RequestMapping("getUserList")
	public ModelAndView getUserList(Model model,HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<User> userList=service.getAllUsers();
		model.addAttribute("userList", userList);
		model.addAttribute("oper", "getList");
		return new ModelAndView("welcome");
	}
	
	@RequestMapping("deleteUserById")
	public ModelAndView deleteUserById(Model model,HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		try {
			service.deleteUser(id);
		} catch (Exception e) {
			return new ModelAndView("userReqOp");
		}
		model.addAttribute("massage", "User with id="+id+" delete");
		return new ModelAndView("welcome");
	}
	
}
