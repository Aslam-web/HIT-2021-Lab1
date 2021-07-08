package com.lab.book2.p2.programs.whileloop;

public class MultiplicationTableWhile {
	public static void main(String[] args) {
		int table=10;
		int count=1;
		while (count<=10) {
			System.out.printf("%d * %d = %d", table, count, table*count);
			System.out.println();
			count++;
		}
	}
}
