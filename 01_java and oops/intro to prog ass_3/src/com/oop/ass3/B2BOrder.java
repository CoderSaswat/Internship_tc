package com.oop.ass3;

public class B2BOrder extends Order {
	String companyName;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String getOrderType() {
		return "B2B";
	}

	@Override
	public String toString() {
		return "B2BOrder [companyName=" + companyName + "]";
	}

}
