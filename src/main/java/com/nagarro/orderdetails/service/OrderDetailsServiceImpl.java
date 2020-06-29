package com.nagarro.orderdetails.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.nagarro.orderdetails.response.dto.OrderDetailsResponseListTO;
import com.nagarro.orderdetails.response.dto.OrderDetailsResponseTO;
import com.nagarro.orderdetails.response.dto.UserOrdersDetailsResponseTO;

@Service
public class OrderDetailsServiceImpl implements OrderDetailsService {

	@Override
	public OrderDetailsResponseListTO getAllOrdersForAUser(Long userId) {

		List<UserOrdersDetailsResponseTO> userOrderList = new ArrayList<>();

		userOrderList.add(new UserOrdersDetailsResponseTO(1L,
				new OrderDetailsResponseListTO(Arrays.asList(new OrderDetailsResponseTO(1L, 250, "14-Apr-2020"),
						new OrderDetailsResponseTO(2L, 450, "15-Apr-2020")))));

		userOrderList.add(new UserOrdersDetailsResponseTO(2L,
				new OrderDetailsResponseListTO(Arrays.asList(new OrderDetailsResponseTO(3L, 350, "15-Apr-2020"),
						new OrderDetailsResponseTO(4L, 550, "16-Apr-2020")))));
		
		
		return userOrderList.stream()
				.filter(userOrdersDetailsResponseTO -> (userOrdersDetailsResponseTO.getUserId() == userId))
				.collect(Collectors.toList()).get(0).getDetailsResponseListTO();

	}

}
