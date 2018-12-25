package com.phoniex.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing
public class SpringHiberApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringHiberApplication.class, args);
	}
	
}
