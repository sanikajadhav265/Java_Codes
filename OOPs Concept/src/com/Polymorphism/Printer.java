package com.Polymorphism;

public class Printer {
	
	public void print(int eid, String ename, long adharno, String panno) {
		System.out.println("Employee ID:"+eid);
		System.out.println("Employee Name:"+ename);
		System.out.println("Employee Adhar NO:"+adharno);
		System.out.println("Employee Pan No:"+panno);
	}
	
	public void print(int eid, String ename, double salary, int age) {
		System.out.println("Employee ID:"+eid);
		System.out.println("Employee Name:"+ename);
		System.out.println("EMployee Salary:"+salary);
		System.out.println("Employee Age:"+age);
	}
	
	public static void main(String[] args) {
		Printer p=new Printer();
		System.out.println("-------------Employee Details:-------------");
		p.print(10,"Sanika", 700000, 20);
		System.out.println(" ");
		System.out.println("--------------Employee Details:---------------");
		p.print(21, "Renuka", 2345432345l, "DKL546432");
	}

}
