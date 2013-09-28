package com.algo.webshop.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.algo.webshop.common.domain.Good;
import com.algo.webshop.common.domainimpl.IGood;

@Controller
public class GoodsController {
	private IGood service;

	@Autowired
	public void setUserService(@Qualifier("goodService") IGood service) {
		this.service = service;
	}

	@RequestMapping("addGood")
	public ModelAndView goodReqOp(Model model, @ModelAttribute Good good) {
		service.addGood(good);
		model.addAttribute("massage", "good " + good.getName()
				+ " successfully added");
		return new ModelAndView("goodWelcome");
	}

	@RequestMapping("getGoodById")
	public ModelAndView getGoodById(Model model, @RequestParam("id") int id) {
		Good good = service.getGood(id);
		model.addAttribute("massage", "good name = " + good.getName());
		return new ModelAndView("goodWelcome");
	}

	@RequestMapping("getGoodByCategoryID")
	public ModelAndView getGoodByCategoryID(Model model,
			@RequestParam("id") int id) {
		List<Good> goodList = service.getGoods(id);
		model.addAttribute("goodList", goodList);
		return new ModelAndView("goodWelcome");
	}
	
	@RequestMapping("removeGoodById")
	public ModelAndView removeGoodById(Model model,
			@RequestParam("id") int id) {
		service.removeGood(id);
		model.addAttribute("massage", "good with id "+id+"was removed");
		return new ModelAndView("goodWelcome");
	}
	
	@RequestMapping("updateGood")
	public ModelAndView updateGood(Model model, @ModelAttribute Good good) {
		service.updateGood(good);
		model.addAttribute("massage", "good " + good.getName()
				+ " successfully updated");
		return new ModelAndView("goodWelcome");
	}

}
