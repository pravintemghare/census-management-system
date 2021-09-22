package com.cg.censusmanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.censusmanagementsystem.dao.DetailsRepository;
import com.cg.censusmanagementsystem.entities.Details;

@Service
public class DetailsServiceImpl implements IDetailsService {

	@Autowired
	private DetailsRepository detailsRepository;
	
	
	@Override
	public Details saveDetails(Details details) {
		
		return detailsRepository.save(details);
	}

}
