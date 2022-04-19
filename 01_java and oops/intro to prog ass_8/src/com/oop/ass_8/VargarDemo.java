package com.oop.ass_8;

import java.util.ArrayList;

public class VargarDemo {

	private String getEnglishName(int n) {
		String st = null;
		switch (n) {
		case 1:
			st = "One";
			break;
		case 2:
			st = "Two";
			break;
		case 3:
			st = "Three";
			break;
		case 4:
			st = "Four";
			break;
		case 5:
			st = "Five";
			break;
		case 6:
			st = "Six";
			break;
		case 7:
			st = "Seven";
			break;
		case 8:
			st = "Eight";
			break;
		case 9:
			st = "Nine";
			break;
		case 10:
			st = "Ten";
			break;

		}
		return st;
	}

	public ArrayList<String> myVargar(int... nums) {
		ArrayList<String> arr = new ArrayList<String>();
		for (int n : nums) {
			if (n >= 1 && n <= 10) {
				String englishName = getEnglishName(n);
				arr.add(englishName);
			} else if (n % 2 == 0) {
				arr.add("Even Beyond");
			} else {
				arr.add("Odd Beyond");
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		VargarDemo ob = new VargarDemo();
		System.out.println(ob.myVargar(7, 56, 99));
	}

}
