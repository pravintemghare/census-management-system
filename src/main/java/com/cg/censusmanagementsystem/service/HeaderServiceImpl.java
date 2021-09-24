package com.cg.censusmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.cg.censusmanagementsystem.dao.HeaderRepository;
import com.cg.censusmanagementsystem.entities.Header;
import com.cg.censusmanagementsystem.exception.InputException;

@Service
public class HeaderServiceImpl implements IHeaderService {

	@Autowired
	private HeaderRepository headerRepository;
	
	public HeaderServiceImpl(HeaderRepository headerRepository) {
		super();
		this.headerRepository = headerRepository;
	}
	
	@Override
	public Header saveHeader(Header header) {
		
			return headerRepository.save(header);
	}


	@Override
	public List<Header> getAllHeaders() {
		
		return headerRepository.findAll();
		
	}


	

}
