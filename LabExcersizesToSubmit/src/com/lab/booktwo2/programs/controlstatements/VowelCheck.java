package com.lab.booktwo2.programs.controlstatements;

import java.util.Arrays;

public class VowelCheck {

	public static void main(String[] args) {
		char given = 'e';
		char[] vowels = {'a','e','i','o','u'};
		
		if (Arrays.binarySearch(vowels, given) >= 0) {
			System.out.println("Vowel !!!");
			return;
		}
		System.out.println("Nope !!!");
	}

}
