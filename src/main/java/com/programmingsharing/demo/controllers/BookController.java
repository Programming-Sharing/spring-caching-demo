package com.programmingsharing.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.programmingsharing.demo.entity.Book;
import com.programmingsharing.demo.services.BookService;

@RestController
@RequestMapping("book")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/{isbn}")
	public Book findBook(@PathVariable(required = true, value = "isbn") String isbn) {
		Book foundBook = bookService.findBook(isbn);
		return foundBook;
	}
	
}