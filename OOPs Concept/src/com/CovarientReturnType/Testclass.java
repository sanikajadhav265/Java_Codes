package com.CovarientReturnType;

public class Testclass {
	
	public A testmethod() {
	//	A a=new A();
		//return a;
		
	//	B b=new B();
	//	return b;
		
		C c=new C();
		return c;
	}

	 public static void main(String[] args) {
		 
		Testclass t=new Testclass();
		
		//A a=t.testmethod();
		//System.out.println(a.i);
       //  a.m1();	
		
		// B b=(B)t.testmethod();
		// System.out.println(b.i);
		// System.out.println(b.j);
		// b.m1();
		// b.m2();
		 
		 
		 C c=(C)t.testmethod();
		 System.out.println(c.i);
		 System.out.println(c.j);
		 System.out.println(c.k);
		 c.m1();
		 c.m2();
		 c.m3();
	}
}
