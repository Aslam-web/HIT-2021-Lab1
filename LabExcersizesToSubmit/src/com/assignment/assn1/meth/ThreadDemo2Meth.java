package com.assignment.assn1.meth;

import java.util.Date;

public class ThreadDemo2Meth {
	static VaccinationCenter vc;
	
	private static void execute() {
		System.out.println("The job given to kala is executed from this method...");
		try {
			vc.getToken();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws Exception {
		vc = new VaccinationCenter();
		Thread t = Thread.currentThread();
		t.setName("shoiab");
		System.out.println(new Date());
		System.out.println("Before comming to class....");
		
//		Thread kala = new Thread(new JobToKala(vc), "kala");
//		kala.start();
		
//		Runnable r = ThreadDemo2Meth::execute;
//		r.run();									// run() doesn't initiate a thread.
		

		// Method expression
		Thread kala = new Thread(ThreadDemo2Meth::execute, "kala");
		kala.start();
		
		System.out.println(t.getName()+" Taking class.....for 7-9 Golden Batch...." + new Date());
	}
}

class VaccinationCenter {
	public void getToken() throws Exception {
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println(name + "...standing in queue for token....");
		Thread.sleep(4000);
		System.out.println("token received..." + new Date());
	}
}