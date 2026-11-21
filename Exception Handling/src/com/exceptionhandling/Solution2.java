package com.exceptionhandling;

public class Solution2 {
	
	public static void main(String[] args) {
		
		System.out.println("this code will be executed");
		try {
			String arr=args[1];
			System.out.println(arr);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("this code also be executed");
	}

}
