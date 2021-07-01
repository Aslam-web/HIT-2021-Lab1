package com.classwork;

public class ThreadDemo3 {
	public static void main(String[] args) throws Exception{
		Thread t=Thread.currentThread();
		t.setName("muhaimeen");
		System.out.println("Reservation counter started working "+t.getName());
		
		ReservationCounter central=new ReservationCounter();
		
		Thread imran=new Thread(new BookingJob(1000, central), "imran");
//		imran.setPriority(10);
		Thread taqi=new Thread(new BookingJob(500, central), "taqi");
//		taqi.setPriority(2);
		
		imran.start();
//		Thread.sleep(1000);
		taqi.start();
	}
}

class BookingJob implements Runnable {
	int amt;
	ReservationCounter central;

	public BookingJob(int amt, ReservationCounter central) {
		this.amt = amt;
		this.central = central;
	}

	@Override
	public void run() {
		central.bookTicket(amt);
		central.giveChange();
	}
}

class ReservationCounter {
	int amt;

	public void bookTicket(int amt) {
		this.amt = amt;
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println(name + " has come to book the ticket ");
		System.out.println(name + " brought " + this.amt);
	}

	public void giveChange() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println("Change given to " + name);
		System.out.println(name + " takes " + (amt - 100));
	}
}