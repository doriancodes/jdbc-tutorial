package com.example.jdbctutorial;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.Duration;

@SpringBootApplication
public class JdbcTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdbcTutorialApplication.class, args);
	}

}
