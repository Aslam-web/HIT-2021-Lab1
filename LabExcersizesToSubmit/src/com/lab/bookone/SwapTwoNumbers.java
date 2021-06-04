// EXP 4

package com.lab.bookone;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		int first = 120, second= 220;
		System.out.println("--Before swap--");
		System.out.println("First number = " + first);
		System.out.println("Second number = " + second);
	
		// float temporary = first;
		// Error: "Type mismatch: cannot convert from float to int" at line 19
		int temporary = first;
		 
		first = second;
	
		second = temporary;
		System.out.println("--After swap--");
		System.out.println("First number = " + first);
		System.out.println("Second number = " + second);
		
	}

}