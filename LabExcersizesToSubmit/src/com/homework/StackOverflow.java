package com.homework;


// running the main method of any of the class will throw a StackOverFlowError
class FirstClass{
	public static void main(String[] args) {
		SecondClass.main(args);
	}
}

class SecondClass{
	public static void main(String[] args) {
		FirstClass.main(args);
	}
}



// Output:

//Exception in thread "main" java.lang.StackOverflowError
//	at com.homework.SecondClass.main(StackOverflow.java:11)
//	at com.homework.FirstClass.main(StackOverflow.java:5)
//	at com.homework.SecondClass.main(StackOverflow.java:11)
//	at com.homework.FirstClass.main(StackOverflow.java:5)
//	at com.homework.SecondClass.main(StackOverflow.java:11)
//	at com.homework.FirstClass.main(StackOverflow.java:5)
//	at com.homework.SecondClass.main(StackOverflow.java:11)
//...
//...
//...