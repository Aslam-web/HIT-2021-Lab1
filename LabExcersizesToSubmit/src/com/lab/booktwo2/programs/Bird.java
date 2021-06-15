package com.lab.booktwo2.programs;

class Bird {
	int age;
	String name;

	Bird() {
		System.out.println("this is the parrot");
	}

	Bird(String x) {
		name = x;
		System.out.println("this is the " + name);
	}

	Bird(int y, String z) {
		age = y;
		name = z;
		System.out.println("this is a " + age + " year old " + name);
	}

	public static void main(String arr[]) {
		new Bird();
		new Bird("maina");
		new Bird(20, "sparrow");
	}
}