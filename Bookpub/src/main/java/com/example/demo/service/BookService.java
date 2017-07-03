package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import com.example.demo.repository.BookSalesRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private BookSalesRepository bookSalesRepository;

	public List<Book> findAll() {
		return bookRepository.findAll();
	}

	public Book findOne(Double id) {
		return bookRepository.findOne(id);
	}

	public List<Book> findByPriceDesc() {
		return bookRepository.findByOrderByPriceDesc();
	}
	
	public List<Book> findByPriceAsc() {
		return bookRepository.findByOrderByPriceAsc();
	}

	public BookSalesRepository getBookSalesRepository() {
		return bookSalesRepository;
	}

	public void setBookSalesRepository(BookSalesRepository bookSalesRepository) {
		this.bookSalesRepository = bookSalesRepository;
	}

	/*public List<Book> findByReleasedDateDesc() {
		return bookRepository.findByOrderByReleasedDateDesc();
	}*/
	
	/*public List<BookSalesResult> findBookSales()
	{
		return bookSalesRepository.findBookSales();
	}*/
	
}
