package com.assignment.assn1.meth;

public class ThreadRevisionMeth {
	
	public ThreadRevisionMeth() {
		new Thread(ThreadRevisionMeth::print, "goldddddd").start();
	}

	public static void main(String[] args) {

		new ThreadRevisionMeth();
		Thread t = Thread.currentThread();
		System.out.println(t);
		for (int i = 0; i < 5; i++) {
			try {Thread.sleep(500);} catch (Exception e) {}
			System.out.println(i);
		}
	}
	
	public static void print() {
		System.out.println("child thread is executed....");
	}
}