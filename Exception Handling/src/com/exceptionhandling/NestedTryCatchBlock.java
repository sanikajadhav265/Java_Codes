package com.exceptionhandling;

public class NestedTryCatchBlock {

	public static void main(String[] args) {
		System.out.println("------Main Method-----");
		
		try {
			System.out.println("Outer Try");
//			int i=10/0;
//			System.out.println(i);
			try {
				System.out.println("Inner Try");
		//	String s=null;
			//System.out.println(s);
			} catch (NullPointerException e) {
				System.out.println("Inner Catch");
			e.printStackTrace();
			}	
		} catch (ArithmeticException e) {
			System.out.println("Outer Catch");
	       System.out.println(e.getMessage());
		}
	}
}
