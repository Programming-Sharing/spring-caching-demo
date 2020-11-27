package com.programmingsharing.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringCachingDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringCachingDemoApplication.class, args);
	}
}