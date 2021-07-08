package com.lab.book2.p1.q41;

public class Pass {
	static int j = 20;

	public static void main(String argv[]) {
		int i = 10;
		Pass p = new Pass();
		p.amethod(i);
		System.out.println(i);
		System.out.println(j);
	}

	public void amethod(int x) {
		x = x * 2;
		j = j * 2;
	}
}






//Question 41)
//Given the following code what will be output?
//public class Pass{
//static int j=20;
//public static void main(String argv[]){
// int i=10;
// Pass p = new Pass();
// p.amethod(i);
// System.out.println(i);
// System.out.println(j);
// }
// public void amethod(int x){
// x=x*2;
// j=j*2;
// }
//}
//1) Error: amethod parameter does not match variable
//2) 20 and 40
//3) 10 and 40
//4) 10, and 20 

// Answer
// 3) 10 and 40