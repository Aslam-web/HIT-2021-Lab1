package com.lab.book2.p2.programs.array;
public class ArraySwap {

	public static void main(String[] args) {
		int[] a = { 21, 34, 53, 12, 75 };
		int[] b = { 1, 4, 3, 2, 5 };


		System.out.println("Before Swapping");
		for (int i = 0; i < b.length; i++) {
			System.out.println(a[i] + " " + b[i]);
		}
		for (int i = 0; i < a.length; i++) {
			a[i] = a[i] + b[i];
			b[i] = a[i] - b[i];
			a[i] = a[i] - b[i];
		}
		

		System.out.println("After Swapping");
		for (int i = 0; i < b.length; i++) {
			System.out.println(a[i] + " " + b[i]);
		}

	}

}
