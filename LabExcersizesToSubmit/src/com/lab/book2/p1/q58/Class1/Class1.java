package com.lab.book2.p1.q58.Class1;

class Base {
	protected void amethod() {
		System.out.println("amethod");
	}
}

public class Class1 extends Base{
	public static void main(String argv[]) {
		Base b = new Base();
		b.amethod();
	}
}
