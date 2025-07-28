package com.luv2code.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(
//		scanBasePackages = {"com.luv2code.springbootdemo",
//		"com.luv2code.util"})

@SpringBootApplication
public class SpringbootdemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootdemoApplication.class, args);
	}
}
