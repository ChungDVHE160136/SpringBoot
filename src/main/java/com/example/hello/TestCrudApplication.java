package com.example.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication

public class TestCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestCrudApplication.class, args);
	}

}
