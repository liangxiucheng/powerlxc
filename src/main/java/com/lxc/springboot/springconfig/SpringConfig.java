package com.lxc.springboot.springconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.lxc.springboot.dao.UserDAO;

@Configuration
@ComponentScan(basePackages = "com.lxc.springboot")
public class SpringConfig {

	@Bean
	public UserDAO getUserDao() {
		return new UserDAO();
	}
}
