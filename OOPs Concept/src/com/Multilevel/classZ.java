package com.Multilevel;

public class classZ extends classY {
	
	int p=30;
	
	public void m3() {
		System.out.println("classZ m3 method called:");
	}
	public static void main(String[] args) {
		classZ z=new classZ();
		System.out.println(z.i);
		System.out.println(z.j);
		System.out.println(z.p);
		z.m1();
		z.m2();
		z.m3();
	}
}
