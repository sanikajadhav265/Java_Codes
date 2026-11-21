package com.Polymorphism;

public class narrowing {
	
	public void m1(Object o) {
		System.out.println("Object Parameter:");
	}
	public void m1(String s) {
		System.out.println("String Parameter:");
	}
	
//	public void m1(integer i) {
//		System.out.println("Integer Parameter");
//	}
//	
	public static void main(String[] args) {
		narrowing n=new narrowing();
		n.m1(null);
		
	}

}
