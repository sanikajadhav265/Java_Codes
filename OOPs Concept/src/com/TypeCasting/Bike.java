package com.TypeCasting;

public class Bike extends Vehicle{
		
	double mileage=96.9;
	
	public void displayMileage() {
		int roundedMileage=(int)mileage;
		System.out.println(roundedMileage);
	}
	
	public static void main(String[] args) {
		Bike b=new Bike();
		System.out.println(b.speed);
		System.out.println(b.mileage);
		b.displaySpeed();
		b.displayMileage();
	}

}
