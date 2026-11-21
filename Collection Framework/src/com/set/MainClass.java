package com.set;

import java.util.HashSet;
import java.util.Set;

public class MainClass {
	
	public static void main(String[] args) {
		
		Student s1=new Student(101,"Sanika", 87.87f);
		Student s2=new Student(102, "Apurva", 78.54f);
		Student s3=new Student(101,"Sanika", 87.87f);

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		Set<Student> std=new HashSet<Student>();
		std.add(s1);
		std.add(s2);
		std.add(s3);
		
		System.out.println(std);
}

}
