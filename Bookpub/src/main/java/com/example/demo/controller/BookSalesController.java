package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.model.Book;
import com.example.demo.model.User;


@Controller
@RequestMapping("order")
public class BookSalesController {

	@GetMapping("/addToCart")
	public String addToCart(HttpSession session, ModelMap modelMap) {

		User user = (User) session.getAttribute("USER_LOGGED");
		
		Book book = (Book) session.getAttribute("SELECTED_BOOK");

		session.setAttribute("USER_LOGGED", user);
		session.setAttribute("SELECTED_BOOK", book);

		return "order/AddCart";
	}
}