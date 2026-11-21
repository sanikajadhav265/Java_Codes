package com.exceptionhandlingthrow;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {

		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Your Age:");
			int age=sc.nextInt();
			if(age>18) {
				System.out.println("Age is Valid");
			}else {
				throw new AgeNotValidException("Age is Invalid");			
			}
		} catch (AgeNotValidException e) {
			e.printStackTrace();
		}
	}

}
