package com.classwork;

public class TwoThreadsOneTask {
	public static void main(String[] args) {
		Canon bofors=new Canon();
		Thread naina = new Thread(new ShootingTask(bofors),"naina");
		Thread shabeer = new Thread(new ShootingTask(bofors),"shabeer");
		
		naina.start();
		shabeer.start();
	}
}

class ShootingTask implements Runnable {
	Canon gun;

	public ShootingTask(Canon gun) {
		this.gun = gun;
	}

	@Override
	public void run() {
		if (Thread.currentThread().getName().equals("naina")) {
			for (int i = 0; i < 5; i++) {
				this.gun.fill();
			}
		} else if (Thread.currentThread().getName().equals("shabeer")) {
			for (int i = 0; i < 5; i++) {
				this.gun.shoot();
			}
		}
	}
}

class Canon {
	public void fill() {
		System.out.println(Thread.currentThread().getName() + " fills the gun");
	}

	public void shoot() {
		System.out.println(Thread.currentThread().getName() + " shoots the gun");
	}
}