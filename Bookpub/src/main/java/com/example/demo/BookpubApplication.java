package com.example.demo;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookpubApplication {

	private static final Logger LOGGER = Logger.getLogger(BookpubApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BookpubApplication.class, args);
	}

	public static Logger getLogger() {
		return LOGGER;
	}
}
