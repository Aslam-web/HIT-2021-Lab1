package com.lab.booktwo2.programs.display;

public class DisplayDetails {
	
	private Object[] details;
	
	public DisplayDetails(Object[] details) {
		this.details = details;
		print();
	}

	private void print() {
		System.out.println("Name: " + this.details[0]);
		System.out.println("Account No: " + this.details[1]);
	}
}
