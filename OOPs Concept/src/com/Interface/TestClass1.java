package com.Interface;

public class TestClass1 implements I1 ,I2, I3 {

	@Override
	public void m3() {
		System.out.println("Implemented M3 Method");		
	}

	@Override
	public void m2() {
		System.out.println("IMplemented M2 Method");	
	}

	@Override
	public void m1() {
		System.out.println("Implemented M1 Method");		
	}
	
	public void m4() {
		System.out.println("M4 Method");
	}
	
	public static void main(String[] args) {
		System.out.println("----------I1 Interface----------");
		I1 i1=new TestClass1();
	    System.out.println(I1.i);
	    System.out.println(I1.s);
	    i1.m1();
	    System.out.println("------------I2 Interface-----------------");
	    I2 i2=new TestClass1();
	    System.out.println(I2.y);
	    i2.m2();
	    System.out.println("--------------I3 Interface-----------------------");
	    I3 i3=new TestClass1();
	    System.out.println(I3.i);
	    System.out.println(I3.s);
	    System.out.println(I3.y);
	    System.out.println(I3.z);
	    i3.m1();
	    i3.m2();
	    i3.m3();
	    System.out.println("---------------Test Class---------------------");
	    TestClass1 t1=new TestClass1();
	    t1.m1();
	    t1.m2();
	    t1.m3();
	    t1.m4();
	    System.out.println(t1.i);
	    System.out.println(s);
	    System.out.println(I2.y);
	    System.out.println(z);
	}
	
		
	

}
