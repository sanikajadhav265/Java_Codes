package com.employeemgmtsystem;

import java.util.ArrayList;
import java.util.List;

public class Department {
	
	public List<Employee> addEmpDetails() {
		Employee e1=new Employee(101,"Sanika","Pune", 67000);
		Employee e2=new Employee(102,"Pooja","Sangli", 56000);
		Employee e3=new Employee(103,"Snehal","Satara", 34000);
		Employee e4=new Employee(104,"Apurva","Kolhapur", 54000);
		
		List<Employee> emp=new ArrayList<Employee>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		
		return emp;
		
	}

}
