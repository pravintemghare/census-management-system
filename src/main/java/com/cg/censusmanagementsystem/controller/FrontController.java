package com.cg.censusmanagementsystem.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.censusmanagementsystem.entities.Enumerator;

@Controller
public class FrontController {

	
	@RequestMapping(value = "/welcome")
	public ModelAndView welcomePage()
	{
		ModelAndView mav=new ModelAndView("welcome");
		return mav;
	}
	
	

	@RequestMapping(value = "/navbar")
	public ModelAndView navPage()
	{
		ModelAndView mav=new ModelAndView("navbar");
		return mav;
	}
	
	/*
	 * @RequestMapping(value = "/login") public ModelAndView loginPage() {
	 * ModelAndView mav=new ModelAndView("login"); return mav; }
	 */
	
	
	@RequestMapping(value = "/dashboard")
	public ModelAndView dashboardPage()
	{
		ModelAndView mav=new ModelAndView("dashboard");
		return mav;
	}
	
	@RequestMapping(value = "/home")
	public ModelAndView homePage()
	{
		ModelAndView mav=new ModelAndView("home");
		return mav;
	}
	
	
	@RequestMapping(value = "/role")
	public ModelAndView rolePage()
	{
		ModelAndView mav=new ModelAndView("role");
		return mav;
	}
	
	@RequestMapping(value = "/add")
	public ModelAndView addPage()
	{
		ModelAndView mav=new ModelAndView("add");
		return mav;
	}
	
	
	@RequestMapping(value = "/view")
	public ModelAndView viewPage()
	{
		ModelAndView mav=new ModelAndView("view");
		return mav;
	}
	
	@RequestMapping(value = "/about")
	public ModelAndView aboutPage()
	{
		ModelAndView mav=new ModelAndView("about");
		return mav;
	}
	
	
	
	
	@RequestMapping(value = "/help")
	public ModelAndView helpPage()
	{
		ModelAndView mav=new ModelAndView("help");
		return mav;
	}
	
	
	
	
}
