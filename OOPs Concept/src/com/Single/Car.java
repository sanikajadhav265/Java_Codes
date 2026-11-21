package com.Single;

public class Car extends Vehicle{

	String brand="Mahindra";
	
	public void displayCarInfo() {
		System.out.println("Display Car Information");
	}
	
	public static void main(String[] args) {
		Car c=new Car();

		System.out.println(c.fueltype);
		System.out.println(c.speed);
		System.out.println(c.brand);
		c.displayVehicleInfo();
		c.displayCarInfo();

	}
}
