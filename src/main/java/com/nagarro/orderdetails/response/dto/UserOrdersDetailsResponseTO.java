package com.nagarro.orderdetails.response.dto;

import java.io.Serializable;

public class UserOrdersDetailsResponseTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long userId;

	private OrderDetailsResponseListTO detailsResponseListTO;

	public UserOrdersDetailsResponseTO(Long userId, OrderDetailsResponseListTO detailsResponseListTO) {
		super();
		this.userId = userId;
		this.detailsResponseListTO = detailsResponseListTO;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public OrderDetailsResponseListTO getDetailsResponseListTO() {
		return detailsResponseListTO;
	}

	public void setDetailsResponseListTO(OrderDetailsResponseListTO detailsResponseListTO) {
		this.detailsResponseListTO = detailsResponseListTO;
	}

}
