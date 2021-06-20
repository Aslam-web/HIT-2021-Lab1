package com.lab.booktwo2.programs.redoing;

import java.text.NumberFormat;
import java.util.Scanner;

public class Salary {
	public static void main(String[] args) {
		
		double currentSalary; // employee's current salary
		double raise; // amount of the raise
		double newSalary; // new salary for the employee
		String rating; // performance rating
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the current salary: ");
		currentSalary = scan.nextDouble();
		scan.nextLine();
		System.out.print("Enter the performance rating (Excellent, Good, or Poor): ");
		rating = scan.nextLine();
		
		// exc = 6, good = 4, poor = 1.5
		// Compute the raise using if ...
		if(rating.equalsIgnoreCase("Excellent"))
			raise = currentSalary * 0.06;
		else if(rating.equalsIgnoreCase("good"))
			raise = currentSalary * 0.04;
		else
			raise = currentSalary * 0.015;
//		raise = rating.equalsIgnoreCase("Excellent") ? getRaise(currentSalary, 6) 
//					: rating.equalsIgnoreCase("Good") ? getRaise(currentSalary, 4) : getRaise(currentSalary, 1.5); 
		newSalary = currentSalary + raise;

		System.out.println(currentSalary);
		System.out.println(raise);
		System.out.println(newSalary);
		// Print the results
		NumberFormat money = NumberFormat.getCurrencyInstance();
		System.out.println();
		System.out.println("Current Salary: " + money.format(currentSalary));
		System.out.println("Amount of your raise: " + money.format(raise));
		System.out.println("Your new salary: " + money.format(newSalary));
		System.out.println();
		
		scan.close();
	}
	
//	public static double getRaise(double salary, double percentage) {		
//		return salary * (percentage / 100);
//	}
}