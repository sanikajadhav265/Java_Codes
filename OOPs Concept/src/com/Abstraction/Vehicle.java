package com.Abstraction;

public abstract class Vehicle {
	
	int vehicleNo;
	String dirverName;

	public Vehicle(int vehicleNo, String dirverName) {
		super();
		this.vehicleNo = vehicleNo;
		dirverName = dirverName;
	}
	
	public void show() {
		System.out.println("Vehicle No:"+vehicleNo);
		System.out.println("Driver Name:"+dirverName);
	}
	
	public abstract void calculateRent(int day);

}
