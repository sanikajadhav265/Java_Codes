package com.Single;

public class B extends A{
 
	int k=30;
	
	public void m2() {
		System.out.println("classB m2 method called:");
	}
	
	public static void main(String[] args) {
		System.out.println("Parent class");
		A a=new A();
		System.out.println(a.i);
		a.m1();
		
		System.out.println(" ");
		System.out.println("Child class");
		B b=new B();
		System.out.println(b.i);
		System.out.println(b.k);
		b.m1();
		b.m2();
	}
}
