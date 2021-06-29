package com.classwork;

public class ThreadDemo1 {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		t.setName("myThread");
		t.setPriority(10);
		System.out.println("Sleep mode ON");

		Runnable r = ()->{
			System.out.println("Hola");
		};
		new Thread(r).start();

		met(); // 5000
		new Thread(new Job()).start(); // 3000
		System.out.println("After method call");

		
	}

	private static void met() {
		System.out.println("Method called");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Job implements Runnable{
	@Override
	public void run() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("The job is getting executed...");
	}
}