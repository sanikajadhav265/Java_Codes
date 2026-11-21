package com.onlinedelierysystem;

public class Burger extends Food{

private String size;
	
	public Burger(int burgerId, String burgerName, double price, String burgerSize) {
		super(burgerId, burgerName, price);
		this.size=burgerSize;	
	}
	
	@Override
	public void displayFood() {
		super.displayFood();
		System.out.println("Burger Size:"+size);
	}
}
