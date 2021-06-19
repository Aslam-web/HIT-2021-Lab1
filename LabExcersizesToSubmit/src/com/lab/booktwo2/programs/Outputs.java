// Question 18-22

package com.lab.booktwo2.programs;

public class Outputs {

	public static void main(String[] args) {

		Outputs out = new Outputs();
		System.out.println("------Question 18------");
		out.method1(); System.out.println("\n------Question 19------");
		out.method2(); System.out.println("\n------Question 20------");
		out.method3(); System.out.println("\n------Question 21------");
		out.method4(); System.out.println("\n------Question 22------");
		out.method5();
		
	}
	
	public void method1() {
		int a=1; int b=2;
		int c,d;
		c = ++b;
		d = a++;
		c++;
		System.out.println("c = "+c+" d = "+d);
	}
	
	public void method2() {
		int a=4; int b=1; boolean c = a<b;
		System.out.println("c = "+c);
	}
	
	public void method3() {
		boolean done = false;
		if(!done) {}
		if(done) {}
		System.out.println("a and b");
//		if(done==0)
//		if(done!=0)
	}
	
	public void method4() {
		boolean a = true; boolean b = false;
		boolean c = a | b;
		boolean d = a & b;
		boolean e = a ^ b;
		boolean f = (! a & b) | (a &! b);
		boolean g = !a; 
		System.out.println("c = "+c+" d = "+d+" e = "+e+" f = "+f+" g = "+g);
	}
	
	public void method5() {
		int a = 20,b = 10;
		int x = a>b? a:b;
		System.out.println("x = "+x);
	}

}


// 				Output: 
//				------Question 18------
//				c = 4 d = 1

//				------Question 19------
//				c = false

//				------Question 20------
//				a and b

//				------Question 21------
//				c = true d = false e = true f = true g = false

//				------Question 22------
//				x = 20