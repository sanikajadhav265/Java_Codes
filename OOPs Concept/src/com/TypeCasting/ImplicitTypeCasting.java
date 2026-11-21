package com.TypeCasting;

public class ImplicitTypeCasting {
	public static void main(String[] args) {
	System.out.println("---------------Byte--------------------");	
	byte b=100;
	
	short s=b;
	System.out.println(s);
	
	int i=b;
	System.out.println(i);
	
	long l=b;
	System.out.println(l);
	
	float f=b;
	System.out.println(f);
	
	double d=b;
	System.out.println(d);
	
	System.out.println("-----------------Short---------------------");
	
	short s1=200;
	
	int i1=s1;
	System.out.println(i1);
	
	long l1=s1;
	System.out.println(l1);
	
	float f1=s1;
	System.out.println(f1);
	
	double d1=s1;
	System.out.println(d1);
	
	System.out.println("---------------------Long----------------------");
	long l2=2344533l;
	
	float f2=l2;
	System.out.println(f2);
	
	double d2=l2;
	System.out.println(d2);
	
	System.out.println("----------------------Float---------------------");
	
	float f3=234.543f;
	
	double d3=f3;
	System.out.println(d3);
	}
}
