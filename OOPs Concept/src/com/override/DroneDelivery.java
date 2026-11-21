package com.override;

public class DroneDelivery extends Delivery{
	
	@Override
	public void delivery() {
		System.out.println("Your Order is Delivered in 15 Mins");
	}

}
