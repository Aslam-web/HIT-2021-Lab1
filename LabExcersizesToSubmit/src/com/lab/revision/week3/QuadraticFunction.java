package com.lab.revision.week3;

public class QuadraticFunction {
	int a=1,b=1,c=1;
	public QuadraticFunction() {}
	
	public QuadraticFunction(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public int getC() {
		return c;
	}

	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void setC(int c) {
		this.c = c;
	}
	
	public void compute(int x) {
//		f(x) = ax2 + bx + c.
		int fx = a*(x*x) + b*x + c;
		System.out.printf("a=%d, b=%d, c=%d, x=%d\n",a,b,c,x);
		System.out.printf("f(x)\t= %d*(%d*%d) + %d*%d + %d"
				+ "\n\t= ",a,x,x,b,x,c,a);
		System.out.print(fx);
		System.out.println("\n------------------------------------");
	}
	
	public static void main(String[] args) {
		QuadraticFunction function1 = new QuadraticFunction();
		function1.compute(5);
		
		QuadraticFunction function2 = new QuadraticFunction(3, 4, 1);
		function2.compute(5);
		
		QuadraticFunction function3 = new QuadraticFunction();
		function3.setA(3);
		function3.setB(4);
		function3.setC(1);
		function3.compute(5);
		System.out.println("a of function3: "+function3.getA());
		System.out.println("b of function3: "+function3.getB());
		System.out.println("c of function3: "+function3.getC());
	}
}