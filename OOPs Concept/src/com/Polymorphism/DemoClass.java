package com.Polymorphism;

public class DemoClass {
	
//	public DemoClass(int i){
//		System.out.println("Single Parameterised Constructor");
//	}
//	public DemoClass(int i,int j) {
//		System.out.println("Double Parameterised Constructor");
//	}

	private void m1(int i) {
		System.out.println("M1 Single Parameter");
	}
	
	public void m1(byte b,short s) {
		System.out.println("M1 Byte and Short Parameter");
	}
	
	public void m1(int i,int j) {
		System.out.println("M1 Two Parameter");
	}
	
	public static void m1(String s, float f) {
		System.out.println("M1 String and Float Parameter");
	}
	
	  void m1(double d) {
		System.out.println("M1 Double Parameter");
	}
	
	public final static void m1(String s,char c,long l) {
		System.out.println("M1 String and Char Parameter ");
	}
	
	public final static void main(String[] args) {
		DemoClass d=new DemoClass();
		d.m1(12);
		d.m1(10, 20);
		DemoClass.m1("SANU", 45.54f);
		d.m1(2334.432);
		d.m1("Sanika", 'A',3342324435l);
//		byte b=10;
//		short s=20;
		d.m1(20,30);

	}

}
