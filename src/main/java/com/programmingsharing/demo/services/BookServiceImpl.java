package com.programmingsharing.demo.services;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.programmingsharing.demo.entity.Book;
import com.programmingsharing.demo.simulator.NetworkSpeedSimulator;

@Component
public class BookServiceImpl implements BookService {
	
	private static final Logger log = LoggerFactory.getLogger(BookServiceImpl.class);


	@Cacheable(cacheNames = "getBookWithCache", key = "#isbn10")
	public Book findBook(String isbn10) {
		long waitDuration = TimeUnit.SECONDS.toMillis(3);
		
		log.info("Waiting for "+waitDuration+" miliseconds to receive result");
		NetworkSpeedSimulator.slowSpeed(waitDuration); // Wait for 3 second before returning the result
		return new Book("0134685997", "Effective Java", 1);
	}
}
