package com.cg.censusmanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.cg.censusmanagementsystem.dao.EnumeratorRepository;
import com.cg.censusmanagementsystem.entities.Enumerator;
import com.cg.censusmanagementsystem.exception.EnumeratorNotFoundException;
import com.cg.censusmanagementsystem.exception.InputException;


@Service
public class EnumeratorServiceImpl implements IEnumeratorService {

	@Autowired(required=true)
	private EnumeratorRepository repository;

	
	@Override
	public Enumerator saveEnumerator(Enumerator enumerator) {
		
		if(enumerator.getEmail()==null)
		{
			throw new InputException("EmailId can't be empty...");
		}
		
		else if(enumerator.getPassword()==null)
		{
			throw new InputException("Password can't be empty...");
		}
		
		try 
		{
			   return repository.save(enumerator);
	    }
		
		catch(DataIntegrityViolationException e)
		{
	    	throw new InputException("You are already an user,Please go ahead and login...");
		}
	}
	
	
	
	@Override
	public Enumerator getEnumerator(String email, String password) {
		
		Enumerator enumerator=(Enumerator)repository.findById(email).get();
		if(enumerator.getPassword().equals(password)) {
			return enumerator;
		}
		return null;
	

}

}
