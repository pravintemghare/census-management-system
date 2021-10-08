package com.cg.censusmanagementsystem.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cg.censusmanagementsystem.dao.EnumeratorRepository;
import com.cg.censusmanagementsystem.entities.Enumerator;
import com.cg.censusmanagementsystem.exception.EnumeratorNotFoundException;
import com.cg.censusmanagementsystem.payload.Login;
import com.cg.censusmanagementsystem.service.IEnumeratorService;

@RestController
public class EnumeratorController {

	@Autowired(required = true)
	public IEnumeratorService service;

	@Autowired(required = true)
	public EnumeratorRepository repository;

	@RequestMapping(value = "/showRegisterForm")
	public ModelAndView showRegisterForm() {

		ModelAndView mav = new ModelAndView("register");
		return mav;

	}

	@PostMapping("/saveEnumerator")
	  public ModelAndView saveEnumerator(@ModelAttribute("enumerator") Enumerator enumerator, HttpServletRequest request) {
			
			service.saveEnumerator(enumerator);
			ModelAndView mav=new ModelAndView("login"); 
			return mav; 
			
	}

		  @RequestMapping(value = "/showLoginForm")
		  public ModelAndView showLoginForm()
		  {
		  
		  ModelAndView mav=new ModelAndView("login"); 
		  return mav;
		  
		  }

		 @PostMapping(value = "/showLoginForm")
		public ModelAndView getEnumerator(@ModelAttribute("login") Login login, HttpServletRequest request) {
		System.out.println("login post method called: email: " + login.getEmail());

		ModelAndView mav;		
		Enumerator admin = service.getEnumerator(login.getEmail(), login.getPassword());
				if (admin != null) {
					System.out.println("admin object is not null");
					mav=new ModelAndView("home"); 
					return mav;
				}
				System.out.println("admin object is null");
				mav=new ModelAndView("login"); 
				mav.addObject("error", "Username or Password is wrong!!");
				return mav;
			}
		  
		  
		  
		  
		  
		  
		  
		  
		  
	
	/*
	 * @GetMapping("/getEnumerator/{email}/{password}") public ModelAndView
	 * getEnumerator(@ModelAttribute("enumerator") Enumerator
	 * enumerator,@PathVariable String email,@PathVariable String
	 * password,HttpServletRequest request){
	 * 
	 * service.getEnumerator("email","password"); ModelAndView mav=new
	 * ModelAndView("login"); return mav;
	 * 
	 * }
	 */
	
}
	
	
	
	
	

