package com.programmingsharing.demo.services;

import java.util.concurrent.TimeUnit;

import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.programmingsharing.demo.entity.Book;
import com.programmingsharing.demo.simulator.CostlyKey;
import com.programmingsharing.demo.simulator.NetworkSpeedSimulator;

@Component
public class BookServiceImpl implements BookService {

	@Cacheable("BOOK")
	public Book getBookWithCache(String isbn10) {
		NetworkSpeedSimulator.slowSpeed(TimeUnit.SECONDS.toMillis(3)); // Wait for 3 second before returning the result
		return new Book("0134685997", "Effective Java", 1);
	}
	
	
	@Override	
	public Book getBookNoCache(String isbn10) {
		NetworkSpeedSimulator.slowSpeed(TimeUnit.SECONDS.toMillis(3)); // Wait for 3 second before returning the result
		return new Book("0134685997", "Effective Java", 1);
	}
	
	@Cacheable("BOOK")
	public Book getBookCostlyKey(CostlyKey costlyKey) {
		return new Book("0134685997", "Effective Java", 1);
	}
	
	@CachePut("UNRESOLVEABLE_CACHE")
	public Book testUpdate(String args) {
		return new Book("0134685997", "Effective Java", 1);
	}

}
