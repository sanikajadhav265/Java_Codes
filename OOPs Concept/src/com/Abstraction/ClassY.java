package com.Abstraction;

public class ClassY extends ClassX {

	@Override
	public void m2() {
		System.out.println("OVERRIDED M2 METHOD:");
	}
	
	public void m3() {
		System.out.println("M2 METHOD:");
	}
	
	public static void main(String[] args) {
		System.out.println("Parent Child Mix Object:");
		ClassX x=new ClassY();
		x.m1();
		x.m2();
		
		
		System.out.println(" ");
		System.out.println("Child Class Object:");
		ClassY y=new ClassY();
		y.m1();
		y.m2();
		y.m3();
		
	}
}
