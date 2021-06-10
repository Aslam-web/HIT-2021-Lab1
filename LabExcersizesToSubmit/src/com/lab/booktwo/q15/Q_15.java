package com.lab.booktwo.q15;

import java.io.*;

public class Q_15 {
	public static void main(String argv[]) {
		Q_15 m = new Q_15();
		System.out.println(m.amethod());
	}

	public int amethod() {
		try {
			FileInputStream dis = new FileInputStream("Hello.txt");
		} catch (FileNotFoundException fne) {
			System.out.println("No such file found");
			return -1;
		} catch (IOException ioe) {
		} finally {
			System.out.println("Doing finally");
		}
		return 0;
	}
}

//Question 15)
//What will be output if you try to compile and run the following code, but there is
//no file called Hello.txt in the current directory?
//import java.io.*;
//public class Mine {
// public static void main(String argv[]){
// Mine m=new Mine(); 
// System.out.println(m.amethod());
//}
//public int amethod() {
// try {
// FileInputStream dis=new FileInputStream("Hello.txt");
// }catch (FileNotFoundException fne) {
// System.out.println("No such file found");
// return -1;
// }catch(IOException ioe) {
// } finally{
// System.out.println("Doing finally");
// }
// return 0;
// }
//}
//1) No such file found
//2 No such file found ,-1
//3) No such file found, Doing finally, -1
//4) 0 

// Answer
// 3) No such file found, Doing finally, -1