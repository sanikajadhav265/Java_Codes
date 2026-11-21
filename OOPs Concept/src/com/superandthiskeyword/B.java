package com.superandthiskeyword;

public class B extends A{
	
	int j=100;
	
	int userid=16;
	
	String name="Pooja";
	
	@Override
	public void m1() {
		//System.out.println("Ovrrided M1 Method");
		super.m1();
	}
	
//	public void m2() {
//		System.out.println("M2 Method");
//		System.out.println(super.userid);
//		System.out.println(super.name);
//		super.m1();
//		m1();
//		
//	}
	
	public static void main(String[] args) {
		B b=new B();
		b.m1();
	}

}
