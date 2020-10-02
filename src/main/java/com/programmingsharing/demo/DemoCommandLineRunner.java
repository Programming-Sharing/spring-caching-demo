package com.programmingsharing.demo;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.programmingsharing.demo.services.BookService;
import com.programmingsharing.demo.simulator.CostlyKey;

//@Component
public class DemoCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	private BookService bookService;

	@Override
	public void run(String... args) throws Exception {
		
		// All arguments are the same value.
		long startTime = System.currentTimeMillis();
		CostlyKey costlyKey = new CostlyKey();
		bookService.getBookCostlyKey(costlyKey);	
		bookService.getBookCostlyKey(costlyKey);
		bookService.getBookCostlyKey(costlyKey);
		bookService.getBookCostlyKey(costlyKey);
		// 
		System.out.println("Total execution time with costly key: "+ TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - startTime) +" second(s)");
		
		// All arguments are the same value.
		startTime = System.currentTimeMillis();
		bookService.getBookWithCache("0134685997");		
		bookService.getBookWithCache("0134685997");
		bookService.getBookWithCache("0134685997");
		bookService.getBookWithCache("0134685997");		
		System.out.println("Total execution time with cache: "+ TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - startTime) +" second(s)");
		
		// All arguments do not have the same value.
		startTime = System.currentTimeMillis();
		bookService.getBookWithCache("0134685997");		
		bookService.getBookWithCache("1134685997");
		bookService.getBookWithCache("2134685997");
		bookService.getBookWithCache("3134685997");		
		System.out.println("Total execution time with cache: "+ TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - startTime)+" second(s)");
		
		
		// All arguments are the same value.
		startTime = System.currentTimeMillis();
		bookService.getBookNoCache("0134685997");
		bookService.getBookNoCache("0134685997");
		bookService.getBookNoCache("0134685997");
		bookService.getBookNoCache("0134685997");		
		System.out.println("Total execution time without cache: "+ TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - startTime)+" second(s)");
	}

}
