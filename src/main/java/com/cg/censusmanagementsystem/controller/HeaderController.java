package com.cg.censusmanagementsystem.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


import com.cg.censusmanagementsystem.entities.Header;
import com.cg.censusmanagementsystem.service.IHeaderService;

@RestController
public class HeaderController {

	@Autowired(required=true)
	public IHeaderService service; 
	
	
	@PostMapping("/saveHeader")
	public ModelAndView saveEnumerator(@ModelAttribute("header") Header header, HttpServletRequest request){
			
			service.saveHeader(header);
			ModelAndView mav=new ModelAndView("add"); 
			return mav; 
			
		}
	
	
	
	
	
}
