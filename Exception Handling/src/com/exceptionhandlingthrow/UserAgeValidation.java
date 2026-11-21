package com.exceptionhandlingthrow;

public class UserAgeValidation {

	public static void validateUserAge(int age) {
		
		if(age >= 18) {
			System.out.println("Account Creation Successfully!!");
		}else {
			throw new ArithmeticException("Person not Eligible to Vote");
		}
	}		

}


