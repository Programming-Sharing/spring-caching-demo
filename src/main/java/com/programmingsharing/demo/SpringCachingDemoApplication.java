package com.programmingsharing.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;

import com.programmingsharing.demo.services.BookService;

@SpringBootApplication
@EnableCaching
public class SpringCachingDemoApplication implements CommandLineRunner {
	
	@Autowired
	private BookService bookService;

	@Autowired
    private ConfigurableApplicationContext context;
	
	@Override
	public void run(String... args) throws Exception {

		System.out.println(bookService.getBookWithCache("0134685997"));
		System.out.println(bookService.getBookWithCache("0134685997"));
		System.out.println(bookService.getBookWithCache("0134685997"));
		System.out.println(bookService.getBookWithCache("0134685997"));

		context.close();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCachingDemoApplication.class, args);
	}

}
