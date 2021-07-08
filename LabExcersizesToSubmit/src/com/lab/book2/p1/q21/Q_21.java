package com.lab.book2.p1.q21;

public class Q_21 {

	public static void main(String[] args) {
		 int i;
		 int j;
		 outer:
		 for (i=1;i <3;i++)
			 inner:
				 for(j=1; j<3; j++) {
					 if (j==2)
						 continue outer;
					 System.out.println("Value for i=" + i + " Value for j=" +j);
				 }
	}

}






//Question 21)

//What will be output by the following code?
//public class MyFor{
//public static void main(String argv[]){
// int i;
// int j;
// outer:
// for (i=1;i <3;i++)
// inner:
// for(j=1; j<3; j++) {
// if (j==2)
// continue outer;
// System.out.println("Value for i=" + i + " Value for j=" +j);
// }
// }
//}
//1) Value for i=1 value for j=1
//2) Value for i=2 value for j=1
//3) Value for i=2 value for j=2
//4) Value for i=3 value for j=1 

// Answer
// 1) Value for i=1 value for j=1
// 2) Value for i=2 value for j=1