package com.lab.booktwo1.q43;

//private class Base {
class Base {
	Base() {
		int i = 100;
		System.out.println(i);
	}
}

public class Pri extends Base {
	static int i = 200;

	public static void main(String argv[]) {
		Pri p = new Pri();
		System.out.println(i);
	}
}

//Question 43)

//What will be the result when you try to compile and run the following code?
//private class Base{
//Base(){
// int i = 100;
// System.out.println(i);
// }
//}
//public class Pri extends Base{
//static int i = 200;
//public static void main(String argv[]){
// Pri p = new Pri();
// System.out.println(i);
// }
//}
//1) Error at compile time
//2) 200
//3) 100 followed by 200
//4) 100 

// Answer
// 1) Error at compile time