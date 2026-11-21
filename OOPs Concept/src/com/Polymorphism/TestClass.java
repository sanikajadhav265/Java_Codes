package com.Polymorphism;

public class TestClass {
	
	public void m1(int i) {
		System.out.println("M1 Method Int Parameter:");
	}
	public void m1(String s) {
		System.out.println("M1 Method String Parameter:");
	}
	public void m1(int i , String s) {
		System.out.println("M1 Method Double Paramter:");
	}
	
	public void m1(int i, long l , float f, double d, char c, String s1) {
		System.out.println("M1 method All Parameter Call:");
	}
	public void m1(byte b, short s) {
		System.out.println("M1 Method Double Parameter:");
	}

	public static void main(String[] args) {
		TestClass tc=new TestClass();
		//tc.m1(10);
		//tc.m1("Sanika");
		//tc.m1(12, "Pooja");
		tc.m1(10, 4586847373l, 45.76f, 56785.8755, 'A', "Sanika");
		byte b=20;
		short s=10;
		tc.m1(b, s);

	}

}
