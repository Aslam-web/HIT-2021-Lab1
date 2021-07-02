package com.assignment.assn1.meth;

public class OptimisticLockMeth {

	private static CounsellingHall university;
	
	public static void main(String[] args) {

		university = new CounsellingHall();

		Thread imran = new Thread(OptimisticLockMeth::execute, "imran");
		Thread secondtaqi = new Thread(OptimisticLockMeth::execute, "secondtaqi");

		imran.start();
		secondtaqi.start();
	}

	private static void execute() {

		if (Thread.currentThread().getName().equals("imran")) {
			university.table1();
			university.table2();
		} else if (Thread.currentThread().getName().equals("secondtaqi")) {
			university.water();
		}
	}
}

class CounsellingHall {
	synchronized public void table1() {
		System.out.println("entered table1...:" + Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
		}
	}

	synchronized public void table2() {
		System.out.println("entered table2...:" + Thread.currentThread().getName());
	}

	public void water() {
		System.out.println("entered water area to drink water....:" + Thread.currentThread().getName());
	}
}