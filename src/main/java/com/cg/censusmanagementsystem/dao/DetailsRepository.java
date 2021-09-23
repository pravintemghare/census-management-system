package com.cg.censusmanagementsystem.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.censusmanagementsystem.entities.Details;

@Repository
public interface DetailsRepository extends CrudRepository<Details,Integer> {

}
