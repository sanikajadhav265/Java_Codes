package com.exceptionhandling;

public class Solution3 {
	
	public static void main(String[] args) {
		
		System.out.println("this code will be executed");
		try {
			int i=8/0;
			System.out.println(i);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("this code also be executed");
	}

}
