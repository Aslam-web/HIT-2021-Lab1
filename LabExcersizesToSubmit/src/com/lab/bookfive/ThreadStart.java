package com.lab.bookfive;

public class ThreadStart {
	public static void main(String[] args) {
		Thread one=new Thread(new MyThread(),"one");
		Thread two=new Thread(new MyThread(),"two");
		Thread three=new Thread(new MyThread(),"three");
		
		one.start();
		two.start();
		three.start();
//		three.start(); // Throws java.lang.IllegalThreadStateException Exception
	}
}

class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("Thread Name: "+Thread.currentThread().getName());
	}
}