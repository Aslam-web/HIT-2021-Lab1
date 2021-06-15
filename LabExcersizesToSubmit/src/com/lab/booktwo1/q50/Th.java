package com.lab.booktwo1.q50;

import java.io.*;

public class Th {
	public static void main(String argv[]) {
		Th t = new Th();
		t.amethod();
	}

	public void amethod() {
		try {
			ioCall();
		} catch (IOException ioe) {
		}
	}

	public void ioCall() throws IOException {
		DataInputStream din = new DataInputStream(System.in);
		din.readChar();
	}

}




//Question 50)

//What code would be most likely for the body of the ioCall method
//1) public void ioCall ()throws IOException{
// DataInputStream din = new DataInputStream(System.in);
// din.readChar();
// }
//2) public void ioCall ()throw IOException{
// DataInputStream din = new DataInputStream(System.in);
// din.readChar();
// }
//3) public void ioCall (){
// DataInputStream din = new DataInputStream(System.in);
// din.readChar();
// }
//4) public void ioCall throws IOException(){
// DataInputStream din = new DataInputStream(System.in);
// din.readChar();
// }

//Answer
// 1) public void ioCall ()throws IOException{
//DataInputStream din = new DataInputStream(System.in);
//din.readChar();
//}
