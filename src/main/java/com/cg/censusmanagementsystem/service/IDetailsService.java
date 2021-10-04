package com.cg.censusmanagementsystem.service;

import java.util.List;

import com.cg.censusmanagementsystem.entities.Details;
import com.cg.censusmanagementsystem.entities.Header;

public interface IDetailsService {

	public Details saveDetails(Details details);
	
	List<Details> getAllDetails();
}
