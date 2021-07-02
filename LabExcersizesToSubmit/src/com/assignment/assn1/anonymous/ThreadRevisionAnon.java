package com.assignment.assn1.anonymous;

public class ThreadRevisionAnon {

	public ThreadRevisionAnon() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("child thread is executed....");
			}
		}, "goldddddd").start();
	}

	public static void main(String[] args) {

		new ThreadRevisionAnon();
		Thread t = Thread.currentThread();
		System.out.println(t);
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
			System.out.println(i);
		}
	}
}

//class ThreadJob implements Runnable {
//	@Override
//	public void run() {
//		System.out.println("child thread is executed....");
//	}
//}