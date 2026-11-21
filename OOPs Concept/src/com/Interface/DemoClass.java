package com.Interface;

public class DemoClass implements I6 {

	@Override
	public void m1() {
		System.out.println("Implemented M1 Method");
	}

	@Override
	public void m2() {
		System.out.println("Implemented M2 Method");
	}

	@Override
	public void m4() {
		System.out.println("Implemented M4 Method");
	}
	
	public static void main(String[] args) {
		I4 i=new DemoClass();
		i.m1();
		
		System.out.println();
		I5 i1=new DemoClass();
		i1.m1();
		i1.m2();
		System.out.println();
		
		I6 i2=new DemoClass();
		i2.m1();
		i2.m2();
		i2.m4();
		
//		System.out.println();
//		DemoClass dc=new DemoClass();
//		dc.m1();
//		dc.m2();
//		dc.m4();

	}

}
