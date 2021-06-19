package com.lab.booktwo2.programs;

public class PrimeCheckForLoop {

	public static void main(String[] args) {
		int num=7;
		for (int i = 2; i < num/2; i++) {
			if (num%i==0) {
				System.out.println("Non Prime !!");
				return;
			}
		}
		System.out.println("Prime yes !!!");
	}

}
