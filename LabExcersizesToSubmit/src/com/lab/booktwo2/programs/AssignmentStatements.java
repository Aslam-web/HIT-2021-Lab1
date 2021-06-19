package com.lab.booktwo2.programs;

public class AssignmentStatements {
	public static void main(String[] args) {
		System.out.println(area(5.0, 12));
		System.out.println(energy(21,3,4,21));
	}
	
	static double area(double r, double h) {
		return Math.PI*r*r + (2*Math.PI*r*h); 	
	}
	
	static double energy(double m, double a, double h, double v) {
		return m*(a*h + (v*v)/2);
	}
}
