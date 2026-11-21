package com.Hierarchical;

public class classD extends classC{
	
	int f=40;
	
	public void m2() {
		System.out.println("m2 method called");
	}
	public static void main(String[] args) {
		 
		classD d=new classD();
		System.out.println(d.f);
		System.out.println(d.i);
		d.m1();
		d.m2();
	}

}
