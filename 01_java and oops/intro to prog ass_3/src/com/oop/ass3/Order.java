package com.oop.ass3;

public abstract class Order {

	int id;
	String date;
	double amount;

	public abstract String getOrderType();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", date=" + date + ", amount=" + amount + "]";
	}

}
