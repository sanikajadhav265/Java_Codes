package com.exceptionhandlingthrow;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		while(flag) {
		System.out.println("Enter Your Age:");
		int age=sc.nextInt();

		try {
			UserAgeValidation.validateUserAge(age);
			flag=false;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Thank You Please Visit Again");
	}

}
}