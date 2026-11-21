package com.Abstraction;

public class Bike extends Vehicle {

	public Bike(int vehicleNo, String dirverName) {
		super(vehicleNo, dirverName);
		
	}

	@Override
	public void calculateRent(int day) {
		System.out.println("Rent of Bike is Daily:"+day*500);
		
	}

}
