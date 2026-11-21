package com.Abstraction;

public abstract class RBI {
	
	public long accountNo=140056953922l;
	public String name="Sanika";
	public long mobNo=7768030791l;
	public String mailid="sanikajadhav34@gmail.com";
	
	
	public void createAccount() {
		System.out.println("Your Account Create SuccessFully!!");	
	}
	
	public abstract void showAccountDetails();
}
