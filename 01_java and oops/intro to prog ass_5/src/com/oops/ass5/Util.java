package com.oops.ass5;

public final class Util {

	private Util() {

	}

	public static boolean isPalindrome(int input) {
		int temp = input;
		int reverse = 0;
		int r;
		while (input != 0) {
			r = input % 10;
			reverse = reverse * 10 + r;
			input = input / 10;
		}
		if (temp == reverse) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isPalindrome(String input) {
		for (int i = 0, j = input.length() - 1; i < j; i++, j--) {
			if (input.charAt(i) != input.charAt(j)) {
				return false;
			}
		}
		return true;
	}

	public static int reverse(int input) {
		int reverse = 0;
		int r;
		while (input != 0) {
			r = input % 10;
			reverse = reverse * 10 + r;
			input = input / 10;
		}
		return reverse;
	}

	public static String reverse(String input) {
		char temp;
		char[] arr = input.toCharArray();
		for (int i = 0, j = input.length() - 1; i < j; i++, j--) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		String rev = new String(arr);
		return rev;
	}

	public static void main(String[] args) {
//		Util ut= new Util(11, "madam"); //error

	}
}
