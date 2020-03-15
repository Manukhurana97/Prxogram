package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDiscoveryClient
public class MediaPixoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MediaPixoServiceApplication.class, args);
	}

}
