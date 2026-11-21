package com.Interface;

public class ClassX implements I{

	@Override
	public void m1() {
       System.out.println("M1 Implented Method");	
	}

	@Override
	public void m2() {
		System.out.println("M2 Implemented Method");	
		
	}
	
	@Override
	public void m3() {
	System.out.println("M3 Implemented Method ");
		
	}
	
	public void m4() {
		System.out.println("M4 Method in Class X");
	}
	
	public static void main(String[] args) {
		
		I i=new ClassX();
		i.m1();
		i.m2();
		i.m3();
		System.out.println(i.i);
		System.out.println(i.j);
		System.out.println(i.k);
		
//		ClassX x=new ClassX();
//		x.m1();
//		x.m2();
//		x.m3();
//	    x.m4();
//		System.out.println(i.i);
//		System.out.println(i.j);
//		System.out.println(i.k);
	}

}
