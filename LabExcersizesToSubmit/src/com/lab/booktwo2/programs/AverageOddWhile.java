package com.lab.booktwo2.programs;

public class AverageOddWhile {

	public static void main(String[] args) {
		int range = 10;
		int i,sum,count;
		sum = i = count = 0; 
		while (i < range) {
			if (i%2!=0) {
				sum+=i;
				count++;
			}
			i++;
		}
		System.out.println("Average "+(sum/count));
	}

}
