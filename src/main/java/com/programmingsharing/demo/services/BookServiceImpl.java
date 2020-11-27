package com.programmingsharing.demo.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.programmingsharing.demo.entity.Book;
import com.programmingsharing.demo.simulator.NetworkSpeedSimulator;

@Component
public class BookServiceImpl implements BookService {
	@Value("${demo.wait.duration:3000}")
	private long waitDuration;
	
	@Cacheable(cacheNames = "getBookWithCache", key = "#isbn10")
	public Book findBook(String isbn10) {
		NetworkSpeedSimulator.slowSpeed(waitDuration);
		return new Book("0134685997", "Effective Java", 1);
	}
}
