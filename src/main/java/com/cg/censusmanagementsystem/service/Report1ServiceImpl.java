package com.cg.censusmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.censusmanagementsystem.dao.Report1Repository;
import com.cg.censusmanagementsystem.entities.Report1;

@Service
public class Report1ServiceImpl implements IReport1Service {

	@Autowired
	private Report1Repository Repository;
	
	public Report1ServiceImpl(Report1Repository Repository) {
		super();
		this.Repository = Repository;
	}
	
	
	@Override
	public List<Report1> getAllReports() {
		
		return Repository.findAll();
	}

}
