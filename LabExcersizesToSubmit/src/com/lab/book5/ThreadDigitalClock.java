package com.lab.book5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadDigitalClock {

	public static void main(String[] args) {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss");

		new Thread(() -> {
			while (true) {
				System.out.println(simpleDateFormat.format(new Date()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		}).start();
	}
}