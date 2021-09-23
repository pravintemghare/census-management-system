package com.cg.censusmanagementsystem.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cg.censusmanagementsystem.entities.Details;
import com.cg.censusmanagementsystem.service.IDetailsService;



@RestController
public class DetailsController {

	@Autowired(required=true)
	public IDetailsService service; 
	
	
	@PostMapping("/saveDetails")
	public ModelAndView saveEnumerator(@ModelAttribute("details") Details details, HttpServletRequest request){
			
			service.saveDetails(details);
			ModelAndView mav=new ModelAndView("add"); 
			return mav; 
			
		}
	
	
	
	
	
}
