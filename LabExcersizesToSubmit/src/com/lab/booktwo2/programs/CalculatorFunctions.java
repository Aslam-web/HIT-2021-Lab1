package com.lab.booktwo2.programs;

public class CalculatorFunctions {
	public static void main(String[] args) {
		add(32, 2);
		sub(32, 99);
		mul(11, 2);
		div(90, 5);
		div(2, 0);
	}
	
	static void add(double a, double b) {
		System.out.println(a+b);
	}
	
	static void sub(double a, double b) {
		System.out.println(a-b);
	}
	
	static void mul(double a, double b) {
		System.out.println(a*b);
	}
	
	static void div(double a, double b) {
		System.out.println(a/b);
	}
}
