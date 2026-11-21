package com.Polymorphism;

public class BankApplication {
	
	public void AccountCreation(long l) {
		System.out.println("7768030791");
	}
	
	public void AccountCreation(String s) {
		System.out.println("Sai");
	}
	
	public void AccountCreation(double d) {
		System.out.println("1000");
	}
	
	public void AccountCreation(float f) {
		System.out.println("99.9%");
	}
	
	public void AccountCreation(int i) {
		System.out.println("8834 2132 4567");
	}
	
	public static void main(String[] args) {
		
		BankApplication ba=new BankApplication();
		ba.AccountCreation("Name");
		ba.AccountCreation(7768030791l);
		ba.AccountCreation(65784356);
		ba.AccountCreation(99.9f);
		ba.AccountCreation(1000.0);
	}

}
