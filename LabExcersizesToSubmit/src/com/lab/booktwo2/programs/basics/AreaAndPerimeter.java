package com.lab.booktwo2.programs.basics;

public class AreaAndPerimeter {

	public static void main(String[] args) {
		System.out.println("Area of square "+area(5));
		System.out.println("Area of rectangle "+area(5,6));
		System.out.println("Perimeter of square "+peri(5));
		System.out.println("Perimeter of rectangle "+peri(5,6));
	}

	static double area(double s) {
		return s*s; 
	}

	static double area(double h, double w) {
		return h*w; 
	}
	
	static double peri(double s) {
		return 4*s;
	}
	
	static double peri(double h, double w) {
		return 2*(h+w);
	}
}
