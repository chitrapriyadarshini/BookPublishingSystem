package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;

@Controller
@RequestMapping("book")
public class BookController {

	private static final Logger LOGGER = Logger.getLogger(BookController.class);

	@Autowired
	private BookService bookService;

	@GetMapping("/list")
	public String list(HttpSession session) {

		LOGGER.info("Entering list");
		List<Book> book = null;
		book = bookService.findAll();
		session.setAttribute("book", book);
		return "book/list";

	}
	@GetMapping("/{isbn}")
	public String show(@PathVariable("isbn") Double isbn, HttpSession session) {
		System.out.println("ShowBook:" + isbn);
		Book book = bookService.findOne(isbn);
		session.setAttribute("SELECTED_BOOK", book);
		return "book/show";
	}
}