package com.lab.booktwo2.programs.whileloop;

public class FiboWhile {
	public static void main(String[] args) {
		int range=15,num1=0,num2=1;

		while (range>0) {
			int sum=num1+num2;
			System.out.print(num1+"\t");
			num1 = num2;
			num2 = sum;
			range--;
		}
	}
}
