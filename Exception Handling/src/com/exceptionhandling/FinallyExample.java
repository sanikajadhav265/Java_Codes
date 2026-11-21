package com.exceptionhandling;

public class FinallyExample {
	
	public static void main(String[] args) {
		
		System.out.println("hii");
		try {
//			Integer i=new Integer("Sanika");
//			System.out.println(i);
//			String std=args[2];
//			System.out.println(std);
			int i=8/0;
			System.out.println(i);
		}catch(Exception e) {
		System.out.println("catch block");
			e.printStackTrace();
		}finally {
			System.out.println("finally block");
		}
	}

}
