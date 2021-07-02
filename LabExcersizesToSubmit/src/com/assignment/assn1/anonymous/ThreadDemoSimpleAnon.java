package com.assignment.assn1.anonymous;

public class ThreadDemoSimpleAnon {
	
	public static void main(String[] args) {
		
		//Anonymous inner class
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("thread execution logic ");
			}
		});
		t.start();
	}
}