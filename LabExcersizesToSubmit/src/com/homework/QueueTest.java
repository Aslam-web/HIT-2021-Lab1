package com.homework;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

// standing in line

public class QueueTest {
	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>();

		System.out.println("Enter the waiting hall or Finised checkup? (e/f)\tQ to quit");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();

		while (input.charAt(0) != 'q') {
			if (input.charAt(0) == 'e') {
				System.out.print("Who wants to enter? ");
				scanner.nextLine();
				String tempPerson = scanner.nextLine();
				queue.add(tempPerson);
				System.out.println("\"" + tempPerson + "\" is standing in line");
			} else if (input.charAt(0) == 'f') {
				if (queue.size() < 1) {
					System.out.println("Everyone left the hall");
				} else
					System.out.println("person \"" + queue.poll() + "\" completed the checkup");
			} else {
				System.out.println("Right value please !");
			}

			System.out.println("\n-------------------------------------");
			System.out.println("Enter the waiting hall or Finised checkup? (e/f)\tQ to quit");
			input = scanner.next();
		}
		System.out.println("get well soon !!");

		scanner.close();
	}
}