package com.Abstraction;

public class VehicleTest {
	
	public static void main(String[] args) {
		System.out.println("-------------------Car Details---------------------");
		Vehicle v1=new Car1(1234,"Sanika");
		v1.show();
		v1.calculateRent(5);
		System.out.println();
		System.out.println("-------------------Bike Details------------------");
		Vehicle v2=new Bike(3442, "Pooja");
		v2.show();
		v2.calculateRent(8);
	}

}
