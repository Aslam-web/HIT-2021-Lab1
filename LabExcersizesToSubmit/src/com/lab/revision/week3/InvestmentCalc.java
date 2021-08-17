package com.lab.revision.week3;

public class InvestmentCalc {

	public static void main(String[] args) {

		float worth = 0;
		float investment = 14000;
//		System.out.println("worth: "+ worth);
		
		float firstYear = investment * 0.4f;
		worth += firstYear;
//		System.out.println("worth: "+ worth);

		float secondYear = -1_500;
		worth += secondYear;
//		System.out.println("worth: "+ worth);

		float thirdYear = investment * 0.12f;
		worth += thirdYear;
		
		System.out.println("worth: "+ worth);
	}
}