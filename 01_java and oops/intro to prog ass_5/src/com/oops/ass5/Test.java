package com.oops.ass5;

public class Test {

	public static void main(String[] args) {
//		Util ut= new Util(11, "madam"); //error

		System.out.println(Util.isPalindrome("madam"));
		System.out.println(Util.isPalindrome("hello"));
		System.out.println(Util.isPalindrome(101));
		System.out.println(Util.isPalindrome(103));
		System.out.println(Util.reverse(107));
		System.out.println(Util.reverse("saswat"));
	}

}
