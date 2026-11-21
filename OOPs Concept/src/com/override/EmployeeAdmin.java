package com.override;

public class EmployeeAdmin {

	  public static void main(String[] args) {
		
		  System.out.println("-----------Employee Details:------------");
		  Employee e=new Employee();
		  e.empdetails();
		  System.out.println(e.empid);
		  System.out.println(e.name);
		  System.out.println(e.salary);
		  
		  System.out.println("-----------Manager Details:---------------");
		  Manager m=new Manager();
		  System.out.println(m.empid);
		  System.out.println(m.name);
		  System.out.println(m.salary);
		  System.out.println(m.teamsize);
		  
		  System.out.println("-----------Developer Details:---------------");
		  Developer d=new Developer();
		  System.out.println(d.empid);
		  System.out.println(d.name);
		  System.out.println(d.salary);
		  System.out.println(d.programmimglng);
		  
		  System.out.println("-----------Tester Details:---------------");
		  Tester t=new Tester();
		  System.out.println(t.empid);
		  System.out.println(t.name);
		  System.out.println(t.salary);
		  System.out.println(t.numberofbugs);
	}
}
