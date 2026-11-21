package com.Abstraction;

public class Flute extends Instrument {

	@Override
	public void play() {
		System.out.println("The Flute makes Soft Sound.");	
	}

	@Override
	public void displayInfo() {
		System.out.println("The Flute is Long and Thin Instrument.");	
	}

	@Override
	public void tune() {
		System.out.println("You play the flute by Blowing air into it.");
		
	}

}
