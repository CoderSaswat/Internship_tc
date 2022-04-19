package com.oop.ass3;

public class B2COrder extends Order {
	String customerName;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Override
	public String getOrderType() {
		return "B2C";
	}

	@Override
	public String toString() {
		return "B2COrder [customerName=" + customerName + "]";
	}

}
