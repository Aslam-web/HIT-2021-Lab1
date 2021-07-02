package com.assignment.assn1.lambda;

import java.util.Date;

public class ThreadDemo2Lambda {
	public static void main(String[] args) throws Exception {
		VaccinationCenter vc = new VaccinationCenter();
		Thread t = Thread.currentThread();
		t.setName("shoiab");
		System.out.println(new Date());

		System.out.println("Before comming to class....");
		
		// lambda function
		Thread kala = new Thread(()->{
			System.out.println("The job given to kala is executed from this method...");
			try {
				vc.getToken();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}, "kala");
		
		kala.start();
		System.out.println("Take class.....for 7-9 Golden Batch...." + new Date());
	}
}

class JobToKala implements Runnable {
	VaccinationCenter vc;

	public JobToKala(VaccinationCenter vc) {
		this.vc = vc;
	}

	@Override
	public void run() {
		System.out.println("The job given to kala is executed from this method...");
		try {
			vc.getToken();
		} catch (Exception e) {
			e.printStackTrace();
		}
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