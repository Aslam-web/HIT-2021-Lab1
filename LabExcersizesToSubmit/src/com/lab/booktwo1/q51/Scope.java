package com.lab.booktwo1.q51;

public class Scope {
	private int i;

	public static void main(String argv[]) {
		Scope s = new Scope();
		s.amethod();
	}

	public static void amethod() {
//		System.out.println(i);
	}
}




//Question 51)

//What will happen when you compile and run the following code?
//public class Scope{
//private int i;
//public static void main(String argv[]){
// Scope s = new Scope();
// s.amethod();
// }//End of main
// public static void amethod(){
//System.out.println(i);
//}//end of amethod
//}//End of class
//1) A value of 0 will be printed out
//2) Nothing will be printed out
//3) A compile time error
//4) A compile time error complaining of the scope of the variable i

// Answer
// 3) A compile time error