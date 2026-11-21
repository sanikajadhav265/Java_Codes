package com.studentmgmtsystem;

import java.util.ArrayList;
import java.util.List;

public class Collage {
	public List<Student> addStudentDetails(){
		Student s1=new Student(101, "Sanika", "Pune", 78.90f);
		Student s2=new Student(102, "Pooja", "Kolhapur", 67.45f);
		Student s3=new Student(103, "Snehal", "Mumbai", 89.74f);
		Student s4=new Student(104, "Apurva", "Satara", 80.60f);
		Student s5=new Student(105, "Aarvi", "Sangli", 56.68f);

		List<Student> str=new ArrayList<Student>();	
		str.add(s1);
		str.add(s2);
		str.add(s3);
		str.add(s4);
		str.add(s5);	
		return str;

	}

}
