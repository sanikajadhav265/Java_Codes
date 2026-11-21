package com.Hierarchical;

public class classE extends classC{
	int g=20;
	
	public void m3() {
		System.out.println("m3 method called");
	}
	 public static void main(String[] args) {
		
		 classE e=new classE();
		 System.out.println(e.g);
		 System.out.println(e.i);
		 e.m1();
		 e.m3();
	}

}
