package com.lab.booktwo2.programs;

class Average {
	public static void main(String args[]) {
		
		float sum=0;
		for (int i = 0; i < args.length; i++) {
			sum += Float.parseFloat(args[i]);
		}
		System.out.println("Average of given numbers is " + sum/args.length);
		
		
//		int n = args.length;
//		float[] x = new float[n];
//		for (int i = 0; i < n; i++) {
//			x[i] = Float.parseFloat(args[i]);
//		}
//		float sum = 0;
//		for (int i = 0; i < n; i++)
//			sum = sum + x[i];
//		float avg = sum / n;
//		System.out.println("Average of given numbers is " + avg);
	}
}
