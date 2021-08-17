package com.lab.revision.week3;

public class Array2dReverse {
	public static void main(String[] args) {
		int[][] arr2 = new int[][] {
			{99,99,99,99},
			{78,96,74,55},
			{100,50,100,50},
			{88,77,99,100},
		};
		
		
		ArrayHelper.print(arr2);

		for (int[] row: arr2) {
			int end = row.length-1;
			for (int start = 0; start < row.length / 2; start++, end--) {
				ArrayHelper.swap(row, start, end);
			}
		}
		
		System.out.println("\n------------------------------\n");
		ArrayHelper.print(arr2);
	}
}
