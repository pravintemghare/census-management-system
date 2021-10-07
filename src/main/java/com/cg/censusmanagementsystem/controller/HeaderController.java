package com.cg.censusmanagementsystem.controller;

import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cg.censusmanagementsystem.dao.HeaderRepository;
import com.cg.censusmanagementsystem.entities.Header;
import com.cg.censusmanagementsystem.service.IHeaderService;

@RestController
public class HeaderController {

	@Autowired(required=true)
	public IHeaderService service; 
	
	
	@Autowired(required=true)
	public HeaderRepository repository; 

	public HeaderController(IHeaderService service) {
		super();
		this.service = service;
	}


	@PostMapping("/zensus-0.0.1-SNAPSHOT/saveHeader")
	public ModelAndView saveEnumerator(@ModelAttribute("header") Header header, HttpServletRequest request){
			
			service.saveHeader(header);
			ModelAndView mav=new ModelAndView("success"); 
			return mav; 
			
		}
	
	
	@GetMapping("/zensus-0.0.1-SNAPSHOT/viewHeader")
	public ModelAndView getAllHeaders(){
		
		ModelAndView mav=new ModelAndView("view");
		mav.addObject("headers",repository.findAll());
		return mav;
		
	}
	
	@GetMapping("/zensus-0.0.1-SNAPSHOT/viewDetails")
	public ModelAndView getAllDetails(){
		
		ModelAndView mav=new ModelAndView("details");
		mav.addObject("headers",repository.findAll());
		return mav;
		
	}
	
	
	
	  
	 
	
	
	
}
