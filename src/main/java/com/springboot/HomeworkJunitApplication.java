package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class HomeworkJunitApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomeworkJunitApplication.class, args);
	}

}
