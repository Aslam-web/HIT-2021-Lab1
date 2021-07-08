package com.homework;

import java.util.Scanner;
import java.util.Stack;

// placing book over the other

public class StackTest {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();

		System.out.println("Put or Take a book? (p/t)\tQ to quit");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		while (input.charAt(0) != 'q') {
			if (input.charAt(0) == 'p') {
				System.out.print("Enter the book name: ");
				scanner.nextLine();
				System.out.println(stack.push("\""+scanner.nextLine()) + "\" placed on top of the stack");
			} else if (input.charAt(0) == 't') {
				if (stack.empty()) {
					System.out.println("no more books mate. try adding perhaps?");
				} else
					System.out.println("You have taken the book \"" + stack.pop()+"\"");
			} else {
				System.out.println("Right value please !");
			}

			System.out.println("\n-------------------------------------");
			System.out.println("Put or Take a book? (p/t)\tQ to quit");
			input = scanner.next();
		}
		System.out.println("waz fun !!");

		scanner.close();
	}
}
