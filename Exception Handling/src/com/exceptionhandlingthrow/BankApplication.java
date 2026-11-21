package com.exceptionhandlingthrow;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		
		try {
			int balance=2000;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a Amount:");
			int amount=sc.nextInt();
			
			if(amount>balance) {
				throw new BankApplicationException("Insufficent Account Balance");
			}else {
				System.out.println("Amount Withdraw Successfully!!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
