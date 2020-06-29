package com.nagarro.orderdetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.orderdetails.response.dto.OrderDetailsResponseListTO;
import com.nagarro.orderdetails.service.OrderDetailsService;

@RestController
public class OrderController {

	@Autowired
	private OrderDetailsService detailsService;

	@GetMapping("/orders/{userId}")
	public ResponseEntity<OrderDetailsResponseListTO> getAllOrdersForAUser(@PathVariable Long userId) {
		return new ResponseEntity<>(detailsService.getAllOrdersForAUser(userId), HttpStatus.OK);

	}

}
