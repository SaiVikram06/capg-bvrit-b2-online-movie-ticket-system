package com.capg.omts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.google.common.base.Predicates;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages= {"com.capg.omts"})
@Configuration
@EntityScan("com.capg.omts.entity")
@EnableSwagger2
@SpringBootApplication
public class OnlineMovieTicketSystemSravyaApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineMovieTicketSystemSravyaApplication.class, args);
		System.out.println("Spring Boot Application Started...");
	}
	@Bean
    public Docket api() { 
		/*
		 * return new Docket(DocumentationType.SWAGGER_2) .select()
		 * .apis(RequestHandlerSelectors.any()) .paths(PathSelectors.any()) .build();
		 */ 
		return new Docket(DocumentationType.SWAGGER_2).select() 
		          .apis(Predicates.not(RequestHandlerSelectors.basePackage("org.springframework.boot")))
		             .build();
    }


}
