package com.onlinedelierysystem;

public class Pizza extends Food{

	private String size;
	
	public Pizza(int id, String name, double price, String size) {
		super(id, name, price);
		this.size=size;	
	}
	
	@Override
	public void displayFood() {
		super.displayFood();
		System.out.println("Pizza Size:"+size);
	}
}
