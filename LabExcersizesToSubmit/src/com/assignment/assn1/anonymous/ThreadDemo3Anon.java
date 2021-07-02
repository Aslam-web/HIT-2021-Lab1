package com.assignment.assn1.anonymous;

public class ThreadDemo3Anon {

	public static void main(String[] args) {

		Thread t = Thread.currentThread();
		t.setName("muhaimeen");
		System.out.println("Reservation counter starting working..." + t.getName());

		ReservationCounter central = new ReservationCounter();

		// Anonymous inner class
		new Thread(new Runnable() {
			@Override
			public void run() {
				central.bookTicket(1000);
				central.giveChange();
			}
		}, "imran").start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				central.bookTicket(500);
				central.giveChange();
			}
		}, "taqi").start();
	}
}

class ReservationCounter {
	int amt;

	public void bookTicket(int amt) {
		Thread t = Thread.currentThread();
		this.amt = amt;
		String name = t.getName();
		System.out.println(name + " has come to book the ticket...");
		System.out.println(name + " brought...:" + amt);
	}

	public void giveChange() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println("Change given to...:" + name);
		System.out.println(name + " takes...:" + (amt - 100));
	}
}