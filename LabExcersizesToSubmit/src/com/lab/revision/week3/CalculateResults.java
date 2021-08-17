package com.lab.revision.week3;

public class CalculateResults {
	public static void main(String[] args) {
		
		int[][] arr = new int[][] {
			{99,99,99,99},
			{78,96,74,55},
			{100,50,100,50},
			{88,77,99,100},
		};
		
//		ArrayHelper.print(arr);
		for (int i = 0; i < arr.length; i++) {
			int total=0;
			for (int j = 0; j < arr[i].length; j++) {
				total += arr[i][j];
			}
			System.out.printf("Average of Student %d : %s\n",(i+1), total/arr[i].length);
		}
	}
}