package com.cg.censusmanagementsystem.service;

import com.cg.censusmanagementsystem.entities.Enumerator;

public interface IEnumeratorService {

	public Enumerator getEnumerator(String email, String password);
	
	public Enumerator saveEnumerator(Enumerator enumerator);
	
	
}
