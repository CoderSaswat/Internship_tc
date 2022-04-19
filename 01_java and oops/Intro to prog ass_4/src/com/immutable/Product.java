package com.immutable;

public final class Product {
	private final int id;
	private final String name;
	private final String description;
	private final int price;
	private final double taxPercent;

	public Product(int id, String name, String description, int price, double taxPercent) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.taxPercent = taxPercent;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getPrice() {
		return price;
	}

	public double getTaxPercent() {
		return taxPercent;
	}

	public static void main(String[] args) {
		Product p1 = new Product(11, "mobile", "this is the best mobile", 20000, 7.5);
		System.out.println(p1.getName());
	}

}
