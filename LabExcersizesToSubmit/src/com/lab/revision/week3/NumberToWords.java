package com.lab.revision.week3;

public class NumberToWords {
	
	public static void main(String[] args) {
		
		int num=7648;

		String[] words = new String[] {"zero","one","two","three","four","five","six","seven","eight","nine"};
		String numString = String.valueOf(num);

		for (int i = 0; i < numString.length(); i++) {
			System.out.print(words[Integer.parseInt(numString.substring(i,i+1))] + " ");
		}
	}
}