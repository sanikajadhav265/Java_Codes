package com.superandthiskeyword;

public class X {
	
	X(){
		System.out.println("555");
	}
	
	X(int i){
		this();
		System.out.println("444");
	}

	X(String s, double d){
		this(45.7f, true, 'a');
		System.out.println("111");
	}
	
	X(float f,boolean b, char c){
		this(12);
		System.out.println("777");
	}
}
