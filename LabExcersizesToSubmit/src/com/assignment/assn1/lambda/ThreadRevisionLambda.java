package com.assignment.assn1.lambda;

public class ThreadRevisionLambda {

	public ThreadRevisionLambda() {
		new Thread(()-> System.out.println("child thread is executed...."), "goldddddd").start();
	}

	public static void main(String[] args) {

		new ThreadRevisionLambda();
		Thread t = Thread.currentThread();
		System.out.println(t);
		for (int i = 0; i < 5; i++) {
			try {Thread.sleep(500);} catch (Exception e) {}
			System.out.println(i);
		}
	}
}