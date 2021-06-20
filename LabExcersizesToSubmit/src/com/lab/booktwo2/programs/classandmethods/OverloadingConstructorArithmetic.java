package com.lab.booktwo2.programs.classandmethods;

public class OverloadingConstructorArithmetic {

	public OverloadingConstructorArithmetic(int a, int b) {
		int sum = a+b;
		System.out.println(sum);
		
	}
	public OverloadingConstructorArithmetic(int a, int b, int c) {
		int sum = a+b+c;
		System.out.println(sum);
		
	}
	public OverloadingConstructorArithmetic(int a, int b, int c, int d) {
		int sum = a+b+c+d;
		System.out.println(sum);
		
	}
}
