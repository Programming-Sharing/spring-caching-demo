package com.programmingsharing.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.programmingsharing.demo.entity.Book;
import com.programmingsharing.demo.services.BookService;

@Controller
@RequestMapping("book")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/{isbn}")
	public String findBook(@PathVariable(required = true, value = "isbn") String isbn, Model model) {
		Book foundBook = bookService.findBook(isbn);
		model.addAttribute("book", foundBook);
		return "bookdetail";
	}
	
}
