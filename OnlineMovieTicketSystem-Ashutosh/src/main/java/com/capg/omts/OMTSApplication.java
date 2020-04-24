/*
Author: Ashutosh
*/
package com.capg.omts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Application starts from here
@SpringBootApplication
public class OMTSApplication {

	public static void main(String[] args) {
		SpringApplication.run(OMTSApplication.class, args);
		System.out.println("Spring Application Started");
	}

}
