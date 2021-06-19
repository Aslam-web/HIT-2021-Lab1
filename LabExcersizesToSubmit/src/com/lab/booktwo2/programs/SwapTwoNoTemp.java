package com.lab.booktwo2.programs;

public class SwapTwoNoTemp {
	
	public static void main(String a[]) {
		int x = 10;
		int y = 5;
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After swaping:" + " x = " + x + ", y = " + y);
	}
}
