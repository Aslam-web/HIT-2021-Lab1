package com.lab.book2.p2.programs.array;

import java.util.Arrays;

public class ArrayBiggestLowest {

	public static void main(String[] args) {
		int[] array = { 1, 4, 3, 100, 32, 432, 2, 5 };
		Arrays.sort(array);
		System.out.println("Lowest= "+array[0]+" Biggest= "+array[array.length-1]);
		
	}

}
