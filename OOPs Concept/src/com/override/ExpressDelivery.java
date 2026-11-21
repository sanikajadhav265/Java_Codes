package com.override;

public class ExpressDelivery extends Delivery{
	
	@Override
	public void delivery() {
		System.out.println("Your Order is Delivered In 10 Mins");
	}

}
