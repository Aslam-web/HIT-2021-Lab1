package com.lab.booktwo1.q02;

public class Q_02 {

	public static void main(String arguments[]) {
//		 amethod(arguments);
		 }
	public void amethod(String[] arguments) {
		 System.out.println(arguments);
		 System.out.println(arguments[1]);
	}

}




//Question 2)
//What will happen if you try to compile and run the following code
//public class MyClass {
// public static void main(String arguments[]) {
// amethod(arguments);
// }
// public void amethod(String[] arguments) {
// System.out.println(arguments);
// System.out.println(arguments[1]);
// }
//}
//1) error Can't make static reference to void amethod.
//2) error method main not correct
//3) error array must include parameter
//4) amethod must be declared with String

// Answer
// 4) Cannot make a static reference to the non-static method