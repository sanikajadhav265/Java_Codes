package com.Abstraction;

public class Car1 extends Vehicle {

	public Car1(int vehicleNo, String dirverName) {
		super(vehicleNo, dirverName);
		
	}

	@Override
	public void calculateRent(int day) {
		System.out.println("Rent of Car is Daily:"+day*1000);
		
	}

}
