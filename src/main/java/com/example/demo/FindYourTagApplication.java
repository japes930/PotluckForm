package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//We'll never mess with this class. Created by default
//tells springboot to run this entire application
@SpringBootApplication
public class FindYourTagApplication {

	public static void main(String[] args) {
		SpringApplication.run(FindYourTagApplication.class, args);
	}

}
