package com.lab.book2.p2.programs.whileloop;

public class EvenNumberRangeWhile {

	public static void main(String[] args) {
		int range = 112;
		int i = 0;
		
		while (i<range+1) {
			if (i%2==0) {
				System.out.print(i+"\t");
			}
			
			i++;
		}
	}

}
