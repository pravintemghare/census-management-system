package com.cg.censusmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.censusmanagementsystem.dao.DetailsRepository;
import com.cg.censusmanagementsystem.entities.Details;
import com.cg.censusmanagementsystem.entities.Header;

@Service
public class DetailsServiceImpl implements IDetailsService {

	@Autowired
	private DetailsRepository detailsRepository;
	
	
	@Override
	public Details saveDetails(Details details) {
		
		return detailsRepository.save(details);
	}


	@Override
	public List<Details> getAllDetails() {
		
		return detailsRepository.findAll();
		
	}

}
