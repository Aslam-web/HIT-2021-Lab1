// Q2

package com.lab.bookfive;

public class ThreadDisplayMessage {

	public static void main(String[] args) throws InterruptedException{
			PrintMessage message=new PrintMessage();

			Thread t1=new Thread(()-> {
				message.pre();
				});
			
			Thread t2=new Thread(()-> {
				message.mid();
			});
			
			Thread t3=new Thread(()-> {
				message.post();
			});

			synchronized (message) {
				t1.start();
				t1.join();
				t2.start();
				t2.join();
				t3.start();
			}
			
	}

}

class PrintMessage {
	public void pre() {
		System.out.print("[-----");
	}

	public void mid() {
		System.out.print("Message");
	}

	public void post() {
		System.out.print("-----]");
	}
}