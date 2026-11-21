package com.Abstraction;

public class Guitars extends Instrument{

	@Override
	public void play() {
		System.out.println("Guitar is Popular Instrument for Playing Music.");	
	}

	@Override
	public void displayInfo() {
	System.out.println("Guitar has a Neck, Body, and frets.");
	}

	@Override
	public void tune() {
		System.out.println("Guitar is Often used in Rock Bands.");
	}

}
