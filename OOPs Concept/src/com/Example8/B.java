package com.Example8;

public class B extends A{

	@Override
	void m1() {
		System.out.println("One");	
	}

	@Override
	void m2() {
		System.out.println("Two");		
	}
	
	void m3() {
		System.out.println("Three");
	}
	
	public static void main(String[] args) {
		A a=new B();
		a.m1();
		a.m2();
	//	a.m3();
	}

	
}
