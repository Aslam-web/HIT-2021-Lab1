package com.lab.booktwo1.q45;

public class Ref {
	public static void main(String argv[]) {
		Ref r = new Ref();
		r.amethod(r);
	}

	public void amethod(Ref r) {
		int i = 99;
		multi(r);
		System.out.println(i);
	}

	public void multi(Ref r) {
//		r.i = r.i * 2;
	}
}




//Question 45

//What will happen when you try compiling and running this code?
//public class Ref{
//public static void main(String argv[]){
// Ref r = new Ref();
// r.amethod(r);
// }
// public void amethod(Ref r){
// int i=99;
// multi(r);
// System.out.println(i);
// }
// public void multi(Ref r){
// r.i = r.i*2;
// }
//}
//1) Error at compile time
//2) An output of 99
//3) An output of 198
//4) An error at runtime 

// Answer
// 1) Error at compile time 