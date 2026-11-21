package com.Hierarchical;

public class Teacher extends School{

	 String teachername="Jadhav Sir";
	 String subject="Science";
	 double salary=50000;
	 
	 public void teacherInfo() {
		 System.out.println("teacher name is Jadhav Sir");
		 System.out.println("Science");
		 System.out.println("50 000");
	 }
	 public static void main(String[] args) {
		Teacher t=new Teacher();
		System.out.println(t.schoolname);
		System.out.println(t.location);
		System.out.println(t.teachername);
		System.out.println(t.subject);
		System.out.println(t.salary);
		System.out.println(" ");
		t.displaySchoolInfo();
		t.teacherInfo();
	}
}
