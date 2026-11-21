package com.Abstraction;

public class Violin extends Instrument{

	@Override
	public void play() {
		System.out.println("Violin is Played using a Wooden Bow.");	
	}

	@Override
	public void displayInfo() {
		System.out.println("Violin is Musical Instrument with Four Strings.");	
	}

	@Override
	public void tune() {
	    System.out.println("Violin is Popular Instrument in an Orchestra.");
		
	}
	
	}
	


