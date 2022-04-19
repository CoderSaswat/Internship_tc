package com.oop.ass3;

public class ConsolePrinter implements Printer {

	@Override
	public void print(Object input) {
		System.out.println(input.toString());
	}

}
