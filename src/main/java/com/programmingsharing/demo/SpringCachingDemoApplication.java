package com.programmingsharing.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCachingDemoApplication implements CommandLineRunner{
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringCachingDemoApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(SpringCachingDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {		
		
	}

}
