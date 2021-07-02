package com.classwork;

public class KitchenActions {
	public static void main(String[] args) {
		Kitchen mess = new Kitchen();

		Thread momCooking = new Thread(new KitchenTask(mess), "momCooking");
		Thread momEating = new Thread(new KitchenTask(mess), "momEating");

		momCooking.start();
		momEating.start();
	}
}

class KitchenTask implements Runnable {
	Kitchen mess;

	public KitchenTask(Kitchen mess) {
		this.mess = mess;
	}

	@Override
	public void run() {
		if (Thread.currentThread().getName().equals("momCooking")) {
			for (int i = 0; i < 5; i++) {
				mess.cook();
			}
		} else if (Thread.currentThread().getName().equals("momEating")) {
			for (int i = 0; i < 5; i++) {
				mess.eat();
			}
		}
	}
}

class Kitchen {
	boolean flag; // true=cooking, false=eating

	synchronized public void cook() {
		if (flag) {
			try {
//				System.out.println("Mom finished cooking");
				wait();
			} catch (InterruptedException e) {
			}
		}
		System.out.println("Mom is cooking nice food");
		flag = true;
		notify();
	}

	synchronized public void eat() {
		if (!flag) {
			try {
//				System.out.println("Mom finished the food\n");
				wait();
			} catch (InterruptedException e) {
			}
		}
		System.out.println("Mom is eating now");
		flag = false;
		notify();
	}
}