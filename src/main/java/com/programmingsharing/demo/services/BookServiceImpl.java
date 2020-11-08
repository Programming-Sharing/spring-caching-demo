package com.programmingsharing.demo.services;

import java.util.concurrent.TimeUnit;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.programmingsharing.demo.entity.Book;
import com.programmingsharing.demo.simulator.NetworkSpeedSimulator;

@Component
public class BookServiceImpl implements BookService {

	@Cacheable(value = "getBookWithCache", key = "#isbn10")
	public Book getBookWithCache(String isbn10) {
		NetworkSpeedSimulator.slowSpeed(TimeUnit.SECONDS.toMillis(3)); // Wait for 3 second before returning the result
		return new Book("0134685997", "Effective Java", 1);
	}
}
