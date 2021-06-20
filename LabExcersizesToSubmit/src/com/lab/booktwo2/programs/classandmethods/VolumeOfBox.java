package com.lab.booktwo2.programs.classandmethods;

public class VolumeOfBox {

	public static void main(String[] args) {
		System.out.println("Volume of the box = "+volume(7,5,2));
	}

	private static int volume(int h, int w, int l) {
		return h*w*l;
	}

}
