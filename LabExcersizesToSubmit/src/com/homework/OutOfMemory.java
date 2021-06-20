package com.homework;

public class OutOfMemory {

	public static void main(String[] args) {
		
		// array cannot hold more than 
		int[] array = new int[Integer.MAX_VALUE];
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);	
		}
	}
}
