package com.lab.booktwo2.programs.whileloop;

public class SumOfDigitsWhile {

	public static void main(String[] args) {
		int num=12345;
		int sum=0;
		while(num>0) {
			int temp = num%10;
			num=num/10;
			sum+=temp;
//			System.out.println("temp= "+temp+ " num= "+num+" sum= "+sum);
		}
		System.out.println(sum);
	}

}
