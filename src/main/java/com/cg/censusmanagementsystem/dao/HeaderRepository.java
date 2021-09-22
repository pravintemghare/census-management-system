package com.cg.censusmanagementsystem.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.censusmanagementsystem.entities.Header;

@Repository
public interface HeaderRepository extends CrudRepository<Header,Integer> {

}
