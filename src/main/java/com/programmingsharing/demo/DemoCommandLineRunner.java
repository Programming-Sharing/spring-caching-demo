package com.programmingsharing.demo;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import com.programmingsharing.demo.services.BookService;

@Component
public class DemoCommandLineRunner implements CommandLineRunner {

	@Autowired
	private BookService bookService;

	@Autowired
    private ConfigurableApplicationContext context;
	
	@Override
	public void run(String... args) throws Exception {

		// All arguments are the same value.
		long startTime = System.currentTimeMillis();
		System.out.println(bookService.getBookWithCache("0134685997"));
		System.out.println(bookService.getBookWithCache("0134685997"));
		System.out.println(bookService.getBookWithCache("0134685997"));
		System.out.println(bookService.getBookWithCache("0134685997"));

		System.out.println("Total execution time with cache: "
				+ TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - startTime) + " second(s)");
		
		context.close();
	}

}