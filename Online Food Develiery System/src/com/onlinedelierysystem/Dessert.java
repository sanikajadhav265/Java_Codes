package com.onlinedelierysystem;

public class Dessert extends Food {
	
    private String type;
	
	public Dessert(int id, String name, double price, String type) {
		super(id, name, price);
		this.type=type;	
	}
	
	@Override
	public void displayFood() {
		super.displayFood();
		System.out.println("Dessert Type:"+type);
	}

}
