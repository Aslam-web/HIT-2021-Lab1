package com.lab.booktwo2.programs.controlstatements;


public class CalculatorSwitch {
	public static void main(String[] args) {

		int a = 9; 
		int b =8;
		
		int operation = 3;
		
		switch (operation) {
		case 1:
			System.out.println("Addition "+(a+b));
			break;
		case 2:
			System.out.println("subtraction "+(a-b));
			break;
		case 3:
			System.out.println("Multiplication "+(a*b));
			break;
		case 4:
			System.out.println("Division "+(a/b));
			break;
			
		default:
			System.out.println("Eroooor");
			break;
		}
		
	}
}
