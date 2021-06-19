package com.lab.booktwo2.programs;

public class PalindromeWhile {
	public static void main(String[] args) {

		int num = 345543, reversedNum = 0, remainder;

		int originalNum = num;

		while (num != 0) {
			remainder = num % 10;
			reversedNum = reversedNum * 10 + remainder;
			num /= 10;
		}

		if (originalNum == reversedNum) {
			System.out.println(originalNum + " is Palindrome.");
		} else {
			System.out.println(originalNum + " is not Palindrome.");
		}
	}
}