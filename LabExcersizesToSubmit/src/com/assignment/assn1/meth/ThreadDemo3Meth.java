package com.assignment.assn1.meth;

public class ThreadDemo3Meth {
	ReservationCounter central;
	int amt;

	public ThreadDemo3Meth(ReservationCounter central, int amt) {
		this.central = central;
		this.amt = amt;
	}

	public void execute() {
		central.bookTicket(amt);
		central.giveChange();
	}

	public static void main(String[] args) {
		Thread.currentThread().setName("muhaimeen");
		System.out.println("Reservation counter starts working..." + Thread.currentThread().getName());

		ReservationCounter central = new ReservationCounter();

		// method reference
//		Runnable imranRunnable = new ThreadDemo3Meth(central, 1000)::execute;
//		Thread imran = new Thread(imranRunnable, "imran");
//		imran.start();
//
//		Runnable taqiRunnable = new ThreadDemo3Meth(central, 500)::execute;
//		Thread taqi = new Thread(taqiRunnable, "taqi");
//		taqi.start();

		new Thread(new ThreadDemo3Meth(central, 1000)::execute, "imran").start();
		new Thread(new ThreadDemo3Meth(central, 500)::execute, "taqi").start();
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