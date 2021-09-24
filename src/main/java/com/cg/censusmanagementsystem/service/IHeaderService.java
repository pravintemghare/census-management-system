package com.cg.censusmanagementsystem.service;

import java.util.List;

import com.cg.censusmanagementsystem.entities.Header;


public interface IHeaderService {

	public Header saveHeader(Header header);
	
	List<Header> getAllHeaders();
}
