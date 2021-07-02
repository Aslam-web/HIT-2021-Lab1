package com.assignment.assn1.lambda;

public class ThreadDemoSimpleLambda {
	
	public static void main(String[] args) {
		
		Thread t = new Thread(()-> System.out.println("thread execution logic "));
		t.start();
	}
}