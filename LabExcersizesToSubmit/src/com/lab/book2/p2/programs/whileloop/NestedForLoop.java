package com.lab.book2.p2.programs.whileloop;

public class NestedForLoop {

	public static void main(String[] args) {
		int k=1;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(k++ +"\t");
			}
			System.out.println();
		}
		System.out.println("---------------------");
		
		
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(0+"\t");
			}
			System.out.println();
		}
	}

}
