package com.CovarientReturnType;

public class DemoClass {

		public P testMethod() {
			
//	    P p=new P();
//	    return p;
//			
//		Q q=new Q();
//		return q;
			
		R r=new R();
		return r;
	}
		
		public static void main(String[] args) {
			DemoClass dc=new DemoClass();
//			P p=dc.testMethod();
//			System.out.println(p.i);
	//		p.m1();
//			
//			
//			Q q=(Q) dc.testMethod();
//			System.out.println(q.j);
//			System.out.println(q.i);
//			q.m1();
//			q.m2();
			
		     R r=(R)dc.testMethod();
		     System.out.println(r.i);
		     System.out.println(r.j);
		     System.out.println(r.k);
		     r.m1();
		     r.m2();
		     r.m3();
			
			
		}

}
