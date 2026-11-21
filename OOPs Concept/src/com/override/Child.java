package com.override;

public class Child extends Parent {

	@Override
	public void m1() {
		System.out.println("Child Overrided Method");
	}
	
	@Override
	public void m2(int i) {
		System.out.println("M2 Overrided Method");
	}
	
	@Override
	public int m3() {
		System.out.println("Overided m3 Method");
		return 12;
		
	}
	
	@Override
	public Parent m4() {
		System.out.println("M4 Overrided Method");
		Child c=new Child();
		return c;
	}
	
//	@Override
//	private void m5() {
//		System.out.println("Overirdrd M5 Method");
//	}
	
	public static void m7() {
		System.out.println("M7 static Method in Child Class");
	}

	public static void main(String[] args) {
		Parent p=new Child();
		p.m1();
		p.m2(10);
		p.m3();
		p.m4();
		p.m6();
		Parent.m7();
		Child.m7();
	 
      
	

	}
}	
	
	
	
	
	
	

