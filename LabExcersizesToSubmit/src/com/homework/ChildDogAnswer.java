package com.homework;

public class ChildDogAnswer {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Child child=new Child();
		
		Item item=new Stone();
		child.playWithDog(dog, item);
	}
}

/*
 * Exception(parent)
 */

abstract class DogExceptions extends Exception {
}

class DogBiteException extends DogExceptions {
	String msg;

	public DogBiteException(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "The exception is: " + msg;
	}
}

class DogBarkException extends DogExceptions {
	String msg;

	public DogBarkException(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "The exception is: " + msg;
	}
}

/*
 * Item(parent)
 */

abstract class Item {
	abstract void execute() throws DogExceptions;
}

class Stick extends Item {
	@Override
	void execute() throws DogBiteException {
		throw new DogBiteException("You beat I bite !!!");
	}
}

class Stone extends Item {
	@Override
	void execute() throws DogBarkException {
		throw new DogBarkException("You Throw I go !!!");
	}
}

/*
 * Dog
 */

class Dog {
	void playWithHuman(Item item) throws DogExceptions {
		item.execute();
	}
}

/*
 * Child
 */

class Child {
	
	void playWithDog(Dog dog, Item item) {
		try {
			dog.playWithHuman(item);
		} catch (DogExceptions de) {
			System.out.println(de);
		}
	}
}
