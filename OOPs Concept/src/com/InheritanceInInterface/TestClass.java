package com.InheritanceInInterface;

public class TestClass implements I3 {

	@Override
	public void m1() {
		System.out.println("Implemeted I1 Method");
		
	}

	@Override
	public void m2() {
		System.out.println("Implemented I2 Method");
	}

	@Override
	public void m3() {
		System.out.println("Implemented I3 Method");
		
	}
	
	public void m4() {
		System.out.println("Testclass Method");
	}
	
	@Override
	public void m5() {
		System.out.println("Implemented I1 Method ");
		
	}

	
	public static void main(String[] args) {
		System.out.println("----------I1 Method-------");
		I1 i1=new TestClass();
		i1.m1();
		i1.m5();
		System.out.println("-----------I2 Method--------");
		I2 i2=new TestClass();
		i2.m1();
		i2.m2();
		System.out.println("--------I3 Method---------");
		I3 i3=new TestClass();
		i3.m1();
		i3.m2();
		i3.m3();
		System.out.println("----------TestClass Method-------------");
		TestClass tc=new TestClass();
		tc.m1();
		tc.m2();
		tc.m3();
		tc.m4();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

	
}
