package com.lab.revision.week3;

public class ResizeArray {

	
	public static void main(String[] args) {

		int[] myArray = new int[] {81,24,63,4,99,51,13,44,8,101};
		
		// myArray before
		System.out.println("myArray length before: "+myArray.length);
		ArrayHelper.print(myArray);

		// create temp array
		int[] tempArray = new int[20];
		System.arraycopy(myArray, 0, tempArray, 5, myArray.length);
		myArray = tempArray;
		
		// myArray after
		System.out.println("myArray length after: "+myArray.length);
		ArrayHelper.print(myArray);
	}
}
