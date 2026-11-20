package com.aggregation;

public class ClassAdmin {
	
	public static void main(String[] args) {
		Course c=new Course();
		c.setCid(11);
		c.setCname("Java FullStack");
		
		Faculty f=new Faculty();
		f.setFid(12);
		f.setFname("Deshmukh Sir");
		f.setCourse(c);
		
		Batch b=new Batch();
		b.setBid(13);
		b.setBname("Batch70 SQL");
		b.setFaculty(f);
		
		Student s=new Student();
		s.setSid(14);
		s.setSname("Sanika");
		s.setBatch(b);

		System.out.println("Student Id:"+s.getSid());
		System.out.println("Student Name:"+s.getSname());
		System.out.println("Batch Id:"+s.getBatch().getBid());
		System.out.println("Batch Name:"+s.getBatch().getBname());
		System.out.println("Faculty Id:"+s.getBatch().getFaculty().getFid());
		System.out.println("Faculty Name:"+s.getBatch().getFaculty().getFname());
		System.out.println("Course Id:"+s.getBatch().getFaculty().getCourse().getCid());
		System.out.println("Course Name:"+s.getBatch().getFaculty().getCourse().getCname());
		
		
	}
	

}
