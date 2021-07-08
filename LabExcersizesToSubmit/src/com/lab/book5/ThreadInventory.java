package com.lab.book5;

public class ThreadInventory {
	public static void main(String[] args) {
		Inventory<Fridge> icici = new Inventory<>();

		Pen pen = new Pen("Mastero pen", "Blue");
		Fridge fridge = new Fridge("Samsung L201 Fridge", "yellow");

		Thread p = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				icici.setProduct(fridge);
			}
		}, "Aslam");

		Thread c = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				icici.getProduct();
			}
		}, "Taqi");

		c.start();
		p.start();
	}
}

class Inventory<T extends Product> {
	T product; // try with product == null
	boolean flag; // false = empty(producer takes actoin)
					// true = full (consumer takes action)

	public synchronized void getProduct() {

		if (!flag) {
			try {
				wait();
			} catch (Exception e) {
			}
		}
		System.out.println(this.product.getName() + " have been taken out from the inventory by: "
				+ Thread.currentThread().getName());
		flag = false;
		notify();
//		return product;
	}

	public synchronized void setProduct(T product) {

		if (flag) {
			try {
				wait();
			} catch (Exception e) {
			}
		}
		this.product = product;
		System.out.println(this.product.getName()+" is placed into the inventory by: " + Thread.currentThread().getName());
		flag = true;
		notify();
	}
}

abstract class Product {
	private String name;
	private String colour;

	public Product(String name, String colour) {
		this.name = name;
		this.colour = colour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

}

class Fridge extends Product {

	public Fridge(String name, String colour) {
		super(name, colour);
	}

}

class Pen extends Product {

	public Pen(String name, String colour) {
		super(name, colour);
	}

}
