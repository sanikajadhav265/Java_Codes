package com.Polymorphism;

public class VolumeCalculator {

	public void calcolateVolume(int side) {
		System.out.println(" ");
		System.out.println("-----------Volume of Cube:-------------------");
		int cube =side *side*side;
		System.out.println("Volume of Cube:"+cube);	
	}
	
	public void calcolateVolume(double radius, double height) {
		System.out.println(" ");
		System.out.println("-----------------Volume of Cylinder:----------------");
		double cylinder=(Math.PI* radius *radius *height);
		System.out.println("Volume of Cylinder:"+cylinder);	
	}
	
	public void calcolateVolume(int l, int w, int h) {
		System.out.println(" ");
		System.out.println("------------Volume of Rectangular Box:--------------");
		int rectangularbox=(l*w*h);
		System.out.println("Volume of Rectangular Box:"+rectangularbox);
	}
	
	public static void main(String[] args) {
		VolumeCalculator vc=new VolumeCalculator();
		vc.calcolateVolume(5);
		vc.calcolateVolume(5, 10);
		vc.calcolateVolume(5,5,5);
	}

}
