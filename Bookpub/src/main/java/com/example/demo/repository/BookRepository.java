package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Book;

public interface BookRepository extends JpaRepository<Book, Double> {

	List<Book> findByOrderByPriceDesc();
	
	List<Book> findByOrderByPriceAsc();
	//List<Book> findByOrderByReleasedDateDesc();

	@Query(name = "SELECT fn_get_order_amount(?1)", nativeQuery = true)
	public Integer findByPrice(Double i);

	//Book findOne(Long isbn);


	


	
	
	
	
}
