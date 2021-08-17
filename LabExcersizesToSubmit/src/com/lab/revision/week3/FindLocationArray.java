package com.lab.revision.week3;

public class FindLocationArray {
	public static void main(String[] args) {
		int num=4;
		int[] arr = new int[] {5,1,7,4,2};
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == num)
				System.out.println(num +" is at index "+i);
		}
	}
}