package com.cg.censusmanagementsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class ZensusApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ZensusApplication.class, args);
	}

}
