package com.lab.booktwo2.programs;

public class WhileLoopSummation {

	public static void main(String[] args) {
		
		int sum=0, n=1;
		while (n <= 10) {
			sum += n;
			n++;
		}
		System.out.println("Summation: " + sum);
	}

}
