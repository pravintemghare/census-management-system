package com.cg.censusmanagementsystem.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cg.censusmanagementsystem.dao.HeaderRepository;
import com.cg.censusmanagementsystem.dao.Report1Repository;
import com.cg.censusmanagementsystem.service.IHeaderService;
import com.cg.censusmanagementsystem.service.IReport1Service;

@RestController
public class Report1Controller {


	@Autowired(required=true)
	public IReport1Service service; 
	
	
	@Autowired(required=true)
	public Report1Repository repository; 
	
	
	
	
	
	  @GetMapping("/barChart") public ModelAndView getAllReports(Model model) {
	  
	  List<Integer> ageList=repository.findAll().stream().map(x->x.getAgegroup1male()).collect(Collectors
	  .toList());
	  List<Integer> yearList=repository.findAll().stream().map(x->x.getCensusyear()).collect( Collectors.
	  toList()); 
	  List<Integer> age2List=repository.findAll().stream().map(x->x.getAgegroup1female()).collect(Collectors
			  .toList());
	  List<Integer> age3List=repository.findAll().stream().map(x->x.getAgegroup2male()).collect(Collectors
			  .toList());
	  List<Integer> age4List=repository.findAll().stream().map(x->x.getAgegroup2female()).collect(Collectors
			  .toList());
	  
	  
	  ModelAndView mav=new ModelAndView("barchart");
	  model.addAttribute("age", ageList); 
	  model.addAttribute("age2", age2List); 
	  model.addAttribute("age3", age3List); 
	  model.addAttribute("age4", age4List); 
	  model.addAttribute("censusyear",yearList);
	  return mav;
	  
	  }
	 
	 
	  
		 
	
}
