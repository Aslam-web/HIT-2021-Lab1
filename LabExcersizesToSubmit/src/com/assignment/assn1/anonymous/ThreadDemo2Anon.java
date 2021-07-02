package com.assignment.assn1.anonymous;

import java.util.Date;

public class ThreadDemo2Anon {
	public static void main(String[] args) throws Exception {
		VaccinationCenter vc = new VaccinationCenter();
		Thread t = Thread.currentThread();
		t.setName("shoiab");
		System.out.println(new Date());
		
		System.out.println("Before comming to class....");
		
		//Anonymous inner class
		Thread kala = new Thread(new Runnable() {
			
			public void run() {
				System.out.println("The job given to kala is executed from this method...");
				try {
					vc.getToken();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}, "kala");
		
		kala.start();
		System.out.println("Take class.....for 7-9 Golden Batch...." + new Date());
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