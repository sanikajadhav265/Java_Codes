package com.Polymorphism;

public class Bank {
	
	public void deposit(double amount) {
		System.out.println("Deposit Amount:"+amount);
	}
	
	public void deposit(double amount, String pay) {
		System.out.println("Payment Mode:"+amount +" "+pay);
	}
	
	public void deposit(double amount,String pay,String branch) {
		System.out.println("Branch Name:"+amount+" "+pay+" "+branch);
	}
	
	public static void main(String[] args) {
		Bank b=new Bank();
		b.deposit(2000);
		double d=2000;
		b.deposit(d, "Cash");
		b.deposit(d,"Cash","Pune");
	}

}
