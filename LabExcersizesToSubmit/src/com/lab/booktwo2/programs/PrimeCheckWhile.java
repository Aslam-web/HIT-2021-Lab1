package com.lab.booktwo2.programs;

public class PrimeCheckWhile {
	public static void main(String[] args) {
		int i=1,num = 2;
		
		while(true) {
			if (num%i == 0) {
				System.out.println("Not prime");
				return;
			}else if(i==9/2) {
				System.out.println("Prime");
				return;
			}
			i++;
		}
	}
}
