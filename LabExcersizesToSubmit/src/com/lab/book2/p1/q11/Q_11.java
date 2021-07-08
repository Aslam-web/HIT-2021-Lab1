package com.lab.book2.p1.q11;

abstract class MineBase {
	 abstract void amethod();
	 static int i;
	}

public abstract class Q_11  extends MineBase{

	public static void main(String[] args) {

		 int[] ar=new int[5];
		 for(i=0;i < ar.length;i++)
		 System.out.println(ar[i]);

	}

}




//Question 11)
//What will be the result of attempting to compile and run the following code?
//abstract class MineBase {
// abstract void amethod();
// static int i;
//}
//public class Mine extends MineBase {
// public static void main(String argv[]){
// int[] ar=new int[5];
// for(i=0;i < ar.length;i++)
// System.out.println(ar[i]);
// }
//}
//1) a sequence of 5 0's will be printed
//2) Error: ar is used before it is initialized
//3) Error Mine must be declared abstract
//4) IndexOutOfBoundes Error 

// Answer
// 3) Error Mine must be declared abstract / The type Q_11 must implement the inherited abstract method MineBase.amethod()