package com.PaymentProcessingSystem;

public class PayPal extends Payment{

	@Override
	public void processPayment2(double amount) {
	  System.out.println("Payment Done with PayPal:"+amount);

	}	
	  
	
}
