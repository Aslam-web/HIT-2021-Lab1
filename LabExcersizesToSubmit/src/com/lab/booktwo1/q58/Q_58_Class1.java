package com.lab.booktwo1.q58;

////Base.java
//package Base;
//class Base {
//	protected void amethod() {
//		System.out.println("amethod");
//	}// End of amethod
//}// End of class base
//package Class1;
////Class1.java
//
//public class Class1 extends Base {
//	public static void main(String argv[]) {
//		Base b = new Base();
//		b.amethod();
//	}// End of main
//}// End of Class1





//Question 58)

//You have these files in the same directory. What will happen when you attempt to compile
//and run Class1.java if you have not already compiled Base.java
////Base.java
//package Base;
//class Base{
// protected void amethod(){
// System.out.println("amethod");
// }//End of amethod
//}//End of class base
//package Class1;
////Class1.java
//public class Class1 extends Base{
//public static void main(String argv[]){
// Base b = new Base();
// b.amethod();
// }//End of main
//}//End of Class1
//1) Compile Error: Methods in Base not found
//2) Compile Error: Unable to access protected method in base class
//3) Compilation followed by the output "amethod"
//4)Compile error: Superclass Class1.Base of class Class1.Class1 not found

// Answer
// 4)Compile error: Superclass Class1.Base of class Class1.Class1 not found