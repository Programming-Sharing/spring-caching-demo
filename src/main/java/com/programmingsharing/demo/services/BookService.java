package com.programmingsharing.demo.services;

import com.programmingsharing.demo.entity.Book;

public interface BookService {
	
	public Book findBook(String isbn10);

}
