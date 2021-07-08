package com.lab.book2.p1.q17;

class Base {}
class Sub extends Base {}
class Sub2 extends Base {}
public class Q_17{
 public static void main(String argv[]){
 Base b=new Base();
 Sub s=(Sub) b;
 }
}




//Question 17)
//What will happen if you attempt to compile and run the following code?
//1) Compile and run without error
//2) Compile time Exception
//3) Runtime Exception
//class Base {}
//class Sub extends Base {}
//class Sub2 extends Base {}
//public class CEx{
// public static void main(String argv[]){
// Base b=new Base();
// Sub s=(Sub) b;
// }
//}

// Answer
// 3) Runtime Exception






//https://stackoverflow.com/questions/4862960/explicit-casting-from-super-class-to-subclass/24366779