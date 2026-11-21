package com.PaymentProcessingSystem;

public class AdminProcessPayment {
	
	public static void main(String[] args) {
		System.out.println("Credit Card Payment:");
		CreditCard cc=new CreditCard();
		cc.processPayment(6000);
		System.out.println(" ");
		
		System.out.println("Pay Pal Payment:");
		PayPal pp=new PayPal();
		pp.processPayment2(10000.500);
		
		System.out.println(" ");
		System.out.println("Bank Transfer Payment:");
		BankTransfer bt=new BankTransfer();
		bt.processPayment3(60000.200);
		
	
	}

}
