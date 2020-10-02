package com.programmingsharing.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.programmingsharing.demo.services.BookService;

@Component
public class CacheResolverCLRunner implements CommandLineRunner {

	@Autowired
	private BookService bookService;

	@Override
	public void run(String... args) throws Exception {
		bookService.testUpdate("");
	}

}
