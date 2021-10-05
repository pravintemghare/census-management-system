package com.cg.censusmanagementsystem.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.censusmanagementsystem.entities.Enumerator;

@Repository
public interface EnumeratorRepository extends CrudRepository<Enumerator, String>{
	
	public Optional<Enumerator> findByEmailAndPassword(String email, String password);
} 
