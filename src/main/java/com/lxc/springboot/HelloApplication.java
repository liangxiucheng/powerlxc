package com.lxc.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@SpringBootConfiguration
public class HelloApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}
}
