package com.exceptionhandling;

public class Solution1 {
	
	public static void main(String[] args) {
		System.out.println("this code will be executed");
		try {
			Integer i=new Integer("sanika");
			System.out.println(i);	
		} catch (Exception e) {
		   e.printStackTrace();
		}
		System.out.println("this code also be executed");
	}

}
