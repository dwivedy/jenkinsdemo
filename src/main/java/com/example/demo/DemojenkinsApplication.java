package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemojenkinsApplication {

	public static void main(String[] args) {
		SendHTMLEmail.sendEmail();
		SpringApplication.run(DemojenkinsApplication.class, args);
	}

}


