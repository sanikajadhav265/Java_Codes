package com.PaymentProcessingSystem;

public class CreditCard extends Payment {
	
	@Override
	public void processPayment(double d) {
		System.out.println("Payment Done with Credit Card:"+d);
	}
	
	
}
