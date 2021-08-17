package com.lab.revision.week3;

import java.util.Scanner;

public class AverageOfN {
	public static void main(String[] args) {
		average(new int[] { 10, 20, 30, 40, 50 });

		Scanner sc = new Scanner(System.in);
		System.out.print("Total inputs: ");
		int[] array = new int[sc.nextInt()];
		for (int i = 0; i < array.length; i++) {
			array[i]=sc.nextInt();
		}
		average(array);
		sc.close();
	}

	static void average(int[] arr) {
		int total = 0;
		for (int i : arr) {
			total += i;
		}
		System.out.println("Average: " + total / arr.length);
	}
}