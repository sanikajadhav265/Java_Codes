package com.Abstraction;

public abstract class AdminInstrument extends Instrument{

public static void main(String[] args) {
	//System.out.println(" ");
    System.out.println("Violin Instrument:-");
    Instrument ip=new Violin();
    ip.play();
    ip.displayInfo();
    ip.tune();
    
//	System.out.println("Flute Instrument:-");
//	Instrument i=new Flute();
//	i.displayInfo();
//	i.play();
//	i.tune(); 
	
//	System.out.println(" ");
//	System.out.println("Guitars Instrument:-");
//	Instrument it=new Guitars();
//	it.play();
//	it.displayInfo();
//  it.tune();
    

}
}
