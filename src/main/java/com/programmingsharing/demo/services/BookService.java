package com.programmingsharing.demo.services;

import com.programmingsharing.demo.entity.Book;

public interface BookService {
	
	public Book getBookWithCache(String isbn10);

	Book getBookNoCache(String isbn10);

}
