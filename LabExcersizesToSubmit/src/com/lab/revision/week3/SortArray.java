package com.lab.revision.week3;

public class SortArray {

	static int[] arr = new int[] { 81, 24, 63, 4, 99, 51, 13, 44, 8, 101 };

	public static void main(String[] args) {

		boolean ascending = true;

		System.out.print("Before sorting: ");
		ArrayHelper.print(arr);
		System.out.println();

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (ascending && arr[j] > arr[j + 1]) {
					ArrayHelper.swap(arr, j, j + 1);
				} else if (!ascending && arr[j] < arr[j + 1]) {
					ArrayHelper.swap(arr, j, j + 1);
				}
			}
		}

		System.out.println();
		System.out.print("After sorting: ");
		ArrayHelper.print(arr);
	}
}