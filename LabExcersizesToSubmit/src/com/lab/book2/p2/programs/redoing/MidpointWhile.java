package com.lab.book2.p2.programs.redoing;

public class MidpointWhile {
	public static void main(String[] args) {
		int i=10, j=200;
		
		while(++i<--j);
		System.out.println("midpoint "+i);
	}
}
