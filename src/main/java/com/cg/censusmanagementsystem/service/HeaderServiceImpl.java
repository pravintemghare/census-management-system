package com.cg.censusmanagementsystem.service;

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
	
	
	@Override
	public Header saveHeader(Header header) {
		
			return headerRepository.save(header);
	}

}
