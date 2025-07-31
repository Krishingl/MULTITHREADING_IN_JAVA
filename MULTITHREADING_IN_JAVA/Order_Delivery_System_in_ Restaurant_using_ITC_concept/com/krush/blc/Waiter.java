package com.krush.blc;

public class Waiter extends Thread {

	   private Restaurant  restaurant;
	   private String orderName;
	public Waiter(Restaurant restaurant, String orderName) {
		super();
		this.restaurant = restaurant;
		this.orderName = orderName;
	}
	
	
	
	public void acceptOrder(String orderName) 
	{
		this.orderName=orderName;
	}
	@Override
	public void run() {
		
		restaurant.placeOrder(orderName);
		
	}
}
