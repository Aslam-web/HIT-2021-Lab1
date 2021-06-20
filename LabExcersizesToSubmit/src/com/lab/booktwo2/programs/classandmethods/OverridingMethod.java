package com.lab.booktwo2.programs.classandmethods;

public class OverridingMethod {

	public static void main(String[] args) {
		new Derived().aMethod(2121);
	}
}

class Base{

	public void aMethod(int num) {
		System.out.println("From the parent method : "+num);
	}
}

class Derived extends Base{
	public void aMethod(int num) {
		super.aMethod(num);
	}
}