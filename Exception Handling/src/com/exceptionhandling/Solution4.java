package com.exceptionhandling;

public class Solution4 {
	
	public static void main(String[] args) {
		
		System.out.println("this code will be executed");
		try {
			String str=null;
			System.out.println(str.length());	
		} catch (Exception e) {
			e.printStackTrace();	
		}
		System.out.println("this code also be executed");
	}

}
