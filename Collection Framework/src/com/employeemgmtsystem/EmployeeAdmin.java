package com.employeemgmtsystem;

import java.util.Iterator;
import java.util.List;

public class EmployeeAdmin {
		
	public static void main(String[] args) {
		
		Department dept=new Department();
		
		List<Employee> em =dept.addEmpDetails();
		
		Iterator<Employee>e =em.iterator();
		while(e.hasNext()) {
//			Employee emp1=e.next();
//			System.out.println(emp1);
			System.out.println(e.next());
		}
	}

}
