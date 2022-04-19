package com.oop.ass3;

public class App {

	public static void main(String[] args) {

		B2BOrder b2bOrder = new B2BOrder();
		B2COrder b2cOredr = new B2COrder();

		b2bOrder.setCompanyName("thoughtclan");
		b2cOredr.setCustomerName("saswat kumar");

		FilePrinter filePrinter = new FilePrinter();
		filePrinter.print(b2bOrder);
		filePrinter.print(b2cOredr);

		ConsolePrinter consolePrinter = new ConsolePrinter();
		consolePrinter.print(b2bOrder);
		consolePrinter.print(b2cOredr);
	}

}
