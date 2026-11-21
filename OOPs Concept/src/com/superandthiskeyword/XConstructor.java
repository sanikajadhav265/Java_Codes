package com.superandthiskeyword;

public class XConstructor {

	 XConstructor() {
	System.out.println("X Constructor");
	}
	 
	 XConstructor(String s) {
		 this();
		 System.out.println("X Constructor Parameterised Constructor");
		 
		 }	
}
