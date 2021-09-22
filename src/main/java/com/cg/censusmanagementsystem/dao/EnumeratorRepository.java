package com.cg.censusmanagementsystem.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.censusmanagementsystem.entities.Enumerator;

@Repository
public interface EnumeratorRepository extends CrudRepository<Enumerator, String>{
	
} 
