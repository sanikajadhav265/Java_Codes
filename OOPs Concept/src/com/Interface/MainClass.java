package com.Interface;

public class MainClass {
	
	public static void main(String[] args) {
		System.out.println("--------------------Part Time Employee-----------------");
		Employee e1=new PartTime();
		e1.salary(7000);
		
		System.out.println();
		System.out.println("---------------------Full Time Employee-----------------");
		Employee e2=new FullTime();
		e2.salary(15000);
	}

}
