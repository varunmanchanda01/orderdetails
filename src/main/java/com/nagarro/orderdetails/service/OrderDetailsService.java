package com.nagarro.orderdetails.service;

import org.springframework.stereotype.Service;

import com.nagarro.orderdetails.response.dto.OrderDetailsResponseListTO;

@Service
public interface OrderDetailsService {

	public OrderDetailsResponseListTO getAllOrdersForAUser(Long userId);

}
