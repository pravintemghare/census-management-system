package com.cg.censusmanagementsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.censusmanagementsystem.entities.Report1;

@Repository
public interface Report1Repository extends JpaRepository<Report1,Integer>{

}
