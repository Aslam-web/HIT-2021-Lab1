package com.assignment.assn1.meth;

public class ThreadDemoSimpleMeth {
	
	public static void main(String[] args) {
		
		Thread t = new Thread(new ThreadDemoSimpleMeth()::perform);
		t.start();
	}
	
	public void perform() {
		System.out.println("thread execution logic ");
	}
}