package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.OrderItem;
import com.example.demo.repository.OrderItemRepository;

@Service
public class OrderItemService {

	@Autowired
	private OrderItemRepository orderItemRepository;
	
	public void save(OrderItem orderItem) {
		orderItemRepository.save(orderItem);
	}


}
