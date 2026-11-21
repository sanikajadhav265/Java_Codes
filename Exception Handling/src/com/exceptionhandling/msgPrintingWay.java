package com.exceptionhandling;

public class msgPrintingWay {
	
	public static void main(String[] args) {
		try {
			int i=5/0;
		    System.out.println(i);
		}catch(Exception e) {
			System.out.println("First way");
			e.printStackTrace();
			
			System.out.println("Second Way");
			System.out.println(e.getMessage());
			
			System.out.println("Third Way");
			System.out.println(e);
		}
		
	}

}
