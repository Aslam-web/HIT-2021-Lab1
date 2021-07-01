package com.classwork;

public class ThreadRevision {

}

class TicketBooking implements Runnable{
	
	
	@Override
	public void run() {
		
	}
}

class ReservationCounter1 {
	int amt;
	
	public void bookTicket(int amt) {
		this.amt=amt;
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("Ticket booked by Mr...:" + name);
		System.out.println("Amount brought by..:" + name + ": is: " + amt);
	}
	
	public void getChange() {
		
	}
}