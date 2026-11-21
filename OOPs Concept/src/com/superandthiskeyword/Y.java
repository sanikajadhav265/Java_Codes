package com.superandthiskeyword;

public class Y extends X {
	
	Y(){
		this('c');
		System.out.println("666");
	}
	
	Y(boolean b, String s ){
		this();
		System.out.println("999");
	}
	
	Y(char c){
		super("Sanika", 560.8);
	System.out.println("000");
	}
	
	public static void main(String[] args) {
		
		Y y=new Y(true ,"om");
	}

}
