package com.Example7;

public class B extends A{

	@Override
	void m1() {
		A.m2();	
	}

	public static void main(String[] args) {
		B b=new B();
		b.m1();
	}
}
