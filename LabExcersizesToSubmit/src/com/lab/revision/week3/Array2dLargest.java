package com.lab.revision.week3;

public class Array2dLargest {
	public static void main(String[] args) {
		int[][] arr = new int[][] {
			{24,97,98,99},
			{78,96,74,55},
			{100,50,100,50},
			{88,77,99,55},
		};
		
		int rows=1;
		for (int[] row : arr) {
			int largest = row[0];
			for (int i = 1; i < row.length; i++) {
				if (row[i] > largest) {
					largest = row[i];
				}
			}
			System.out.printf("largest of row %d : %d\n",rows++,largest);
		}
	}
}