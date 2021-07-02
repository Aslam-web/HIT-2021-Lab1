package com.freePenFor100Rupee;

public class LockTest2 {
	public static void main(String[] args) {

		// Since the lock is class level it can only be applied to static methods
		// and these static methods need not be accessed through an object.
		// Hence commented (1), (2) and (3).
		
//		ClassLevelLockExample classLock=new ClassLevelLockExample(); //(1)
		
		new Thread(()->{
//			classLock.classLevelLockMethod();	// (2)
			ClassLevelLockExample.classLevelLockMethod();
		}, "Aslam").start();

		new Thread(()->{
//			classLock.classLevelLockMethod();	// (3)
			ClassLevelLockExample.classLevelLockMethod();
		}, "Taqi").start();
	}
}

class ClassLevelLockExample {
	static void classLevelLockMethod() {					// static method
		synchronized (ClassLevelLockExample.class) {		// class lock
			for (int i = 0; i < 5; i++) {
				try {Thread.sleep(100);} catch (InterruptedException e) {}
				System.out.println(Thread.currentThread().getName()+" : "+i);
			}
		}
	}
}