package com.programmingsharing.demo.services;

import com.programmingsharing.demo.entity.Book;
import com.programmingsharing.demo.simulator.CostlyKey;

public interface BookService {
	
	public Book getBookWithCache(String isbn10);

	Book getBookNoCache(String isbn10);

	Book getBookCostlyKey(CostlyKey costlyKey);

	Book testUpdate(String args);

}
