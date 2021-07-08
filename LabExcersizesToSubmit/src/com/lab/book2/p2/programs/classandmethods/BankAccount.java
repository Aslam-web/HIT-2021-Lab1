package com.lab.book2.p2.programs.classandmethods;

public class BankAccount {

	private String name;
	private long accountNumber;
	private String accountType;
	private long balance;
	
	public BankAccount(String name, long accountNumber, String accountType, long balance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.balance = balance;
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
