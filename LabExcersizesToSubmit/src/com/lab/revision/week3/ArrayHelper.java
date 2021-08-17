package com.lab.revision.week3;

public class ArrayHelper {

	static void swap(int a, int b) {
//		System.out.printf("Before swapping %d and %d\n", a, b);
		int temp = a;
		a = b;
		b = temp;
//		System.out.printf("After swapping %d and %d\n", a, b);
	}

	static void swap(int[] arr, int a, int b) {

//		System.out.printf("Before swapping %d and %d\n", arr[a], arr[b]);
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
//		System.out.printf("After swapping %d and %d\n", arr[a], arr[b]);
	}

	static void print(int[] arr) {
		for (int i : arr) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}

	static void print(int[][] arr) {
		for (int[] row : arr) {
			for (int i : row) {
				System.out.print(i + "\t");
			}
			System.out.println();
		}
	}
}