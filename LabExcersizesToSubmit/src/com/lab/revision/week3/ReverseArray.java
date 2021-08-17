package com.lab.revision.week3;

public class ReverseArray {

	public static void main(String[] args) {

		int[] arr = new int[] { 81, 24, 63, 4, 99, 51, 13, 44, 8, 101 };
		int end = arr.length - 1;

		ArrayHelper.print(arr);
		if (arr.length > 1) {
			for (int start = 0; start < arr.length / 2; start++, end--) {
				ArrayHelper.swap(arr,start, end);
//				System.out.printf("After swapping %d and %d\n",arr[start], arr[end]);
				ArrayHelper.print(arr);
			}
		}
		ArrayHelper.print(arr);
	}
}