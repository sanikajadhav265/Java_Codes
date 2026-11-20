package com.model;

import java.util.Scanner;

public class Validator {

	static Scanner sc=new Scanner(System.in);

	public static long validateMobNo() {
		boolean flag=true;
		long MobileNo=0;
		while(flag) {
			System.out.println("Enter Mobile No:");
			MobileNo=sc.nextLong();
			if(MobileNo>=6666666666l && MobileNo<=9999999999l) {
				flag=false;
			}else {
				System.out.println("Invalid Mobile Number, Re-enter it Again!!");
			}
		}

		return MobileNo;
	}
}
