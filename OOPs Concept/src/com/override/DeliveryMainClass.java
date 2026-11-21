package com.override;

public class DeliveryMainClass {
	
	public static void main(String[] args) {
		System.out.println("---------------Bike Deliver-------------------");
		Delivery  d=new BikeDelivery();
		d.delivery();
		System.out.println();
        System.out.println("----------------Drone Deliver-----------------");
		Delivery d1=new DroneDelivery();
		d1.delivery();
		System.out.println();
		System.out.println("----------------Express Deliver---------------");
		Delivery d2=new ExpressDelivery();
		d2.delivery();
	}

}
