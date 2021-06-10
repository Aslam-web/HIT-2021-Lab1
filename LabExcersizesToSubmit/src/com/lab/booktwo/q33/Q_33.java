package com.lab.booktwo.q33;

class Q_33 implements Runnable {

	int i = 0;

	@Override
//	public int run() {
	public void run() {
		while (true) {
			i++;
			System.out.println("i=" + i);
		} // End while
//		return 1;
	}

}

//Question 33)
//What will happen when you attempt to compile and run the following code?.
//1) It will compile and the run method will print out the increasing value of i.
//2) It will compile and calling start will print out the increasing value of i.
//3) The code will cause an error at compile time.
//4) Compilation will cause an error because while cannot take a parameter of true.
//class Background implements Runnable{
// int i=0;
// public int run(){
// while(true){
// i++;
// System.out.println("i="+i);
// } //End while
// return 1;
// }//End run
//}//End class

// Answer
// 3) The code will cause an error at compile time.