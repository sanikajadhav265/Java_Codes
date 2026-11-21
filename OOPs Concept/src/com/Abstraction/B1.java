package com.Abstraction;

public class B1 extends A1 {

	@Override
	void m1() {
		
	}
	
    @Override
    void m2() {
    	System.out.println("Two");
    }
    
    public static void main(String[] args) {
		B1 b=new B1();
		b.m2();
	}
	
	
	
	

}
