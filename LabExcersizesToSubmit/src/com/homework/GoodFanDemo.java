package com.homework;

import java.util.Scanner;

public class GoodFanDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		GoodFan goodFan = new GoodFan();
		System.out.println("Pull it !!!");
		String value = scanner.next();
		while (!value.equalsIgnoreCase("q")) {
			goodFan.pull();
			value = scanner.next();
		}
		System.out.println("May the fan rest in peace");
		scanner.close();

	}

}

class GoodFan {
	State state = new StateOff();

	void pull() {
		state.pull(this);
	}
}

abstract class State {
	abstract void pull(GoodFan goodFan);
}

class StateOff extends State {
	void pull(GoodFan goodFan) {
		System.out.println("State : ON");
		goodFan.state = new StateOn();
	}
}

class StateOn extends State {
	@Override
	void pull(GoodFan goodFan) {
		System.out.println("State : Medium");
		goodFan.state = new StateMedium();
	}
}

class StateMedium extends State {
	@Override
	void pull(GoodFan goodFan) {
		System.out.println("State : High");
		goodFan.state = new StateHigh();
	}
}

class StateHigh extends State {
	@Override
	void pull(GoodFan goodFan) {
		System.out.println("State : Off");
		goodFan.state = new StateOff();
	}
}