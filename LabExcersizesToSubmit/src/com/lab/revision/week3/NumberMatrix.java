package com.lab.revision.week3;

public class NumberMatrix {
	public static void main(String[] args) {
		int height = 4;
		int count = 1;
		for (int i = 0; i < height; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(count++ +"\t");
			}
			System.out.println();
		}
	}
}
