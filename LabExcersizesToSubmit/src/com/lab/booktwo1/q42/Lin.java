package com.lab.booktwo1.q42;

public class Lin {
	public static void main(String argv[]) {
		Lin l = new Lin();
		l.amethod();
	}

	public void amethod() {
		int ia[] = new int[4];
		// Start For loop
		for (int i = 0; i < ia.length; i++) {
			ia[i] = i;
			System.out.println(ia[i]);
		}
	}
}





//Question 42)

//What code placed after the comment //For loop would populate the elements of the array
//ia[] with values of the variable i.?
//public class Lin{
//public static void main(String argv[]){
// Lin l = new Lin();
// l.amethod();
// }
// public void amethod(){
// int ia[] = new int[4];
// //Start For loop
// {
// ia[i]=i;
// System.out.println(ia[i]);
// }
// }
//}
//1) for(int i=0; i < ia.length() -1; i++)
//2) for (int i=0; i< ia.length(); i++)
//3) for(int i=1; i < 4; i++)
//4) for(int i=0; i< ia.length;i++) 

// Answer
// 4) for(int i=0; i< ia.length;i++)