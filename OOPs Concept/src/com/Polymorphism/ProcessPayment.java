package com.Polymorphism;

public class ProcessPayment {

	public void m1(int i) {
		System.out.println("UPI:");	
	}
	
	public void m1(int i , int j) {
		System.out.println("Credit Card:");
	}
	
	public void m1(int i , int j, int k) {
		System.out.println("Debit Card:");
	}
	
	public static void main(String[] args) {
		ProcessPayment p=new ProcessPayment();
	//	p.m1(10);
	//	p.m1(20, 30);
		p.m1(40, 50, 60);
	}
}
