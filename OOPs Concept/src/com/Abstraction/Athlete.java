package com.Abstraction;

public class Athlete extends Person {
	
	@Override
    public void eat() {
		System.out.println("She Eats Friuts and Vegetable Every Day.");
	}

	@Override
	public void excercise() {
		System.out.println("He goes to the gym Every Day.");
		
	}
	
	public static void main(String[] args) {
		System.out.println("Athlete Person:-");
		Person p=new Athlete();
		p.eat();
		p.excercise();
		
//		System.out.println(" ");
//   	System.out.println("Lazy Person:-");
//		Person pp=new LazyPerson();
//	    pp.eat();
//		pp.excercise();
		
		
	}
}
