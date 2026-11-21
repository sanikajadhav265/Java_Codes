package com.CovarientReturnType;

public class MainClass {
	
	public Object mainMethod() {
//		X x=new X();
//		return x;

//		Y y=new Y();
//		return y;
		
		Z z=new Z();
		return z;
	}

	public static void main(String[] args) {
		MainClass mClass=new MainClass();
		
		X m =(X) mClass.mainMethod();
	    
//	    X x=mClass.mainMethod();
//		System.out.println(x.i);
//		x.m1();
		
//		Y y=(Y)mClass.mainMethod();
//		System.out.println(y.i);
//		System.out.println(y.j);
//		y.m1();
//		y.m2();
		
		Z z=(Z)mClass.mainMethod();
		System.out.println(z.i);
		System.out.println(z.j);
		System.out.println(z.k);
		z.m1();
		z.m2();
		z.m3();
	}
}
