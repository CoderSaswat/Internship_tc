package com.oop.ass3;

import java.io.FileWriter;

public class FilePrinter implements Printer {

	@Override
	public void print(Object input) {
		try {
			FileWriter myWriter = new FileWriter("myFile.txt");
			myWriter.write(input.toString());
			myWriter.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
