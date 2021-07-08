package com.lab.book2.p2.programs.array;
import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {
		int[] array = { 1, 4, 3, 2, 5 };
		Arrays.sort(array);
//		System.out.println(array.length);
		for (int i = array.length-1; i >= 0; i--) {
//			System.out.println(i);
			System.out.print(array[i]+" ");
		}
	}

}
