package com.superandthiskeyword;

public class Parent {
	
	Parent(){
		System.out.println("Parent Constructor");
		walk();
	}
	
	public void run() {
		System.out.println("Parent Run");
		walk();
	}
	
	public void walk() {
		System.out.println("Parent Walk");
		
	}

}
