package com.lab.booktwo2.programs.classandmethods;

public class BankAccount2 {

	private String name;
	private long accountNumber;
	private String accountType;
	private long balance;
	
	public void init() {
		this.name = "Aslam";
		this.accountNumber = 100200100;
		this.accountType = "savings";
		this.balance = 30000;
	}
	
	public long deposit(long amount) {
		if(this.balance >= amount) {
			this.balance = this.balance-amount;
			return balance;
		} else
			System.out.println("Insufficient balance !!!");
		return this.balance;
	}
	
	public void display() {
		System.out.println("Name: "+this.name+"\nBalance: "+this.balance);
	}
}
