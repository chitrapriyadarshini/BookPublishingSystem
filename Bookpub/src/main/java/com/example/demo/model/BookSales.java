package com.example.demo.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "book_sales")

public class BookSales {
	@Id
	@GeneratedValue
	@Column(name = "sales_id")
	private int salesId;

	public int getSalesId() {
		return salesId;
	}

	public void setSalesId(int salesId) {
		this.salesId = salesId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@ManyToOne
	@JoinColumn(name = "id")
	private User user;

	@ManyToOne
	@JoinColumn(name = "isbn")
	private Book book;
	
	@Column(name = "price")
	private double price;
	
	@Column(name = "quantity")
	private int quantity;

	@Column(name = "total_amount")
	private double totalAmount;
	
	@Column(name = "order_date")
	private LocalDate orderDate;

	@Column(name = "status")
	private String status;
}