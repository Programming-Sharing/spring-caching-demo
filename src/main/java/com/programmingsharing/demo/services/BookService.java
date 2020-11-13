package com.programmingsharing.demo.services;

import com.programmingsharing.demo.entity.Book;

public interface BookService {
	Book findBook(String isbn10);
}
