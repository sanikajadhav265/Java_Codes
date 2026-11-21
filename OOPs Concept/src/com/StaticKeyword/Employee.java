package com.StaticKeyword;

public class Employee {
	
	int eid=10;
	String ename="Sanika";
	static String companyName="TCS";
	static String address="Pune";
	
	public void displayEmpInformation() {
		System.out.println("Employee ID:"+eid);
		System.out.println("Employee Name:"+ename);
		System.out.println("Company Name:"+companyName);
		System.out.println("Company Address:"+address);
		
	}
	
	public static void displayEmployeeInformation() {
		System.out.println("Company Name:"+companyName);
		System.out.println("Company Address:"+address);
		
		Employee e=new Employee();
		System.out.println("Employee ID:"+e.eid);
		System.out.println("Employee Name:"+e.ename);
	}
	
	public static void main(String[] args) {
		  Employee e1= new Employee();
		  e1.displayEmpInformation();
		  Employee.displayEmployeeInformation();
	}
	

}
