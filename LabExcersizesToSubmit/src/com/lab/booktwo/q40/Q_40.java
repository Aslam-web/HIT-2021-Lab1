package com.lab.booktwo.q40;

class Base {
	Base(int i) {
		System.out.println("base constructor");
	}

	Base() {
	}
}

public class Q_40 extends Base {
	public static void main(String argv[]) {
		Q_40 s = new Q_40();
//One
	}

	Q_40() {
//Two
		super(10);
	}

	public void derived() {
//Three
	}
}
//Question 40)

//Given the following code how could you invoke the Base constructor that will print out the
//string "base constructor";
//class Base{
// Base(int i){
// System.out.println("base constructor");
// }
// Base(){
// }
//}
//public class Sup extends Base{
// public static void main(String argv[]){
// Sup s= new Sup();
// //One
// }
// Sup()
// {
// //Two
// }
// public void derived()
// {
// //Three
// }
//}
//1) On the line After //One put Base(10);
//2) On the line After //One put super(10);
//3) On the line After //Two put super(10);
//4) On the line After //Three put super(10); 

// Answer
// 2) On the line After //Two put super(10);

// https://www.javatpoint.com/super-keyword