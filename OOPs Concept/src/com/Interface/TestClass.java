package com.Interface;

public class TestClass implements InterfaceI {
	
	@Override
	public void m1() {
		System.out.println("Implemented M1 Method");
		
	}

	@Override
	public void m2() {
      System.out.println("Implemneted M2 Method");
		
	}
	
	public void m3() {
		System.out.println("M3 Method");
	}
	
	public static void main(String[] args) {
		TestClass tc=new TestClass();
		tc.m1();
		tc.m2();
		tc.m3();
	    System.out.println(i);
	    System.out.println(j);
	   
	    System.out.println("-----------INDIRECT OBJECT---------");
	    InterfaceI ii=new TestClass();
	    ii.m1();
	    ii.m2();
	    //ii.m3();
	    System.out.println(i);
	    System.out.println(j);
	    
	}

}

