package com.Abstraction;

public class SBI extends RBI {

	@Override
	public void showAccountDetails() {
		System.out.println("Enter Your Account Number and Show Account Details !!");
	}
	public static void main(String[] args) {
		
		SBI sbi=new SBI();
		sbi.createAccount();
		System.out.println();
		sbi.showAccountDetails();
		System.out.println("Account Number: "+sbi.accountNo);
		System.out.println("Name: "+sbi.name);
		System.out.println("Contact Number: "+sbi.mobNo);
		System.out.println("Email Id: "+sbi.mailid);
	}

}
