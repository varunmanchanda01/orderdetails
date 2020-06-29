package com.nagarro.orderdetails.response.dto;

import java.io.Serializable;
import java.util.List;

public class OrderDetailsResponseListTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OrderDetailsResponseListTO(List<OrderDetailsResponseTO> orders) {
		super();
		this.orders = orders;
	}

	private List<OrderDetailsResponseTO> orders;

	public List<OrderDetailsResponseTO> getOrders() {
		return orders;
	}

	public OrderDetailsResponseListTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setOrders(List<OrderDetailsResponseTO> orders) {
		this.orders = orders;
	}
}
