package com.onlinedelierysystem;

public class MainClass {
	
	public static void main(String[] args) {
		
		System.out.println("Restaurant Name:"+Food.restaurantname);
		
		System.out.println(" ");
		
		Pizza p=new Pizza(11, "Paneer Makhani Pizza", 499 ,"Medium");
		p.displayFood();
		p.deliveryService();
		
		System.out.println(" ");
		Burger b=new Burger(12, "Classic American Burger", 299, "Small");
		b.displayFood();
		b.deliveryService();
		
		System.out.println(" ");
		Dessert d=new Dessert(13, "Cake", 250, "Black Forest Cake");
		d.displayFood();
		d.deliveryService();
	}
	
	   
	
}
