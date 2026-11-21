package com.PaymentProcessingSystem;

public class BankTransfer extends Payment {
	
	@Override
	public void processPayment3(double $) {
		System.out.println("Payment Done with Bank Transfer:"+$);
	}

}
