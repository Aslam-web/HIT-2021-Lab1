// Q1

package com.lab.book5;

public class ThreadEvenOdd {

	public static void main(String[] args) {
		new Thread(new EvenOdd(), "even").start();
		new Thread(new EvenOdd(), "odd").start();
	}

}

class EvenOdd extends Thread {
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		if (name.equalsIgnoreCase("even")) {
			for (int i = 0; i < 100; i += 2) {
//				System.out.println(i%2==0 ? "": i);
				System.out.println(name+" : "+i);
			}

		} else if (name.equalsIgnoreCase("odd")) {
			for (int i = 1; i < 100; i += 2) {
				System.out.println(name+"  : "+i);
			}
		}
	}
}