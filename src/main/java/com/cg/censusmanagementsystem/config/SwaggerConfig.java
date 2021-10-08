package com.cg.censusmanagementsystem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicates;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration

public class SwaggerConfig {

	   @Bean
	   public Docket docket() {
		   return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
				   .apis(Predicates.not(RequestHandlerSelectors.basePackage("org.springframework.boot"))).build();
				  
	         }
	     private ApiInfo apiInfo() {
	    	 return new ApiInfoBuilder().title("Census Management System")
	    			 .description("This is a database management system that was designed for efficient registration, storage, "
	    			 		+ "and retrieval of information on Germany's population. Using the software, "
	    			 		+ "Enumerator can enter all the information related to the head of the family including family members details and can delete or edit it, "
	    			 		+ "Admin can also add ,"
	    			 		+ "delete or edit the information, "
	    			 		+ "an authorized user can view all the records.")
	    			 .version("V1.0").build();
	     }
	
	
	
}
