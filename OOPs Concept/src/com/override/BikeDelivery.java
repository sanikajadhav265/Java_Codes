package com.override;

public class BikeDelivery extends Delivery{

	@Override
	public void delivery() {
		System.out.println("Your Order is Delivered In 30 Mins");
	}
}
