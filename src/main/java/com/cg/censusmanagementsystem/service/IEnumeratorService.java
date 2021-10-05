package com.cg.censusmanagementsystem.service;

import com.cg.censusmanagementsystem.entities.Enumerator;

public interface IEnumeratorService {

	public Enumerator saveEnumerator(Enumerator enumerator);
	
	public Enumerator getEnumerator(String email, String password);
}
