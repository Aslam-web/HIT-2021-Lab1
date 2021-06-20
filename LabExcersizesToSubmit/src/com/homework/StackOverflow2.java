package com.homework;

public class StackOverflow2 {

	public static void main(String[] args) {

		int i=0;
		try {
			while(true) {
				i++;
				add();
			}
		} catch (StackOverflowError e) {
			System.out.println(i);
		}
		
	}
	
	static void add() {
		System.out.println();
	}

}
