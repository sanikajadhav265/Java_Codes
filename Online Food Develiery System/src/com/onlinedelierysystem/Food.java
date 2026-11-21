package com.onlinedelierysystem;

public class Food {
	
	private int foodid;
    private String foodname;
    private double price;
    
    static String restaurantname="Food Plaza";
    
    public Food(int foodid, String foodname, double price) {
    	super();
    	this.foodid=foodid;
    	this.foodname=foodname;
    	this.price=price;
    }
    
    public Food() {
    	
    }
    
    public void displayFood() {
    	System.out.println("Food Id:"+foodid);
    	System.out.println("Food Name:"+foodname);
    	System.out.println("Food Price:"+price);
    }
    
    public final void deliveryService() {
    	System.out.println("Doorstep Delivery Available");
    }

	public int getFoodid() {
		return foodid;
	}

	public void setFoodid(int foodid) {
		this.foodid = foodid;
	}

	public String getFoodname() {
		return foodname;
	}

	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public static String getRestaurantname() {
		return restaurantname;
	}

	public static void setRestaurantname(String restaurantname) {
		Food.restaurantname = restaurantname;
	}
    

}
