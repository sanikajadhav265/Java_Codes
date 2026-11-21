package com.superandthiskeyword;

public class Q extends P {
	
	int i=13;
	
	String name="Snehal";
	
	@Override
	public void m1() {
		super.m3();
		System.out.println("PClass M1 Overrided Method");
	}
	
	public void m2() {
		this.m1();
		System.out.println(this.i);
		System.out.println(this.name);
		System.out.println("QClass M2 Method");
	}

	public static void main(String[] args) {
		
		Q q=new Q();
		q.m2();
	}
}
