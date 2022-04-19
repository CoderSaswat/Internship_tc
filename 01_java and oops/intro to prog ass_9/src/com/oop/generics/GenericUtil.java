package com.oop.generics;

public final class GenericUtil {
	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {

		if (x.compareTo(y) >= 0 && x.compareTo(z) >= 0) {
			return x;
		} else if (y.compareTo(z) >= 0) {
			return y;
		} else {
			return z;
		}
	}

	public static <T extends Number> double sum(T[] numbers) {
		double sum = 0;
		for (T val : numbers) {
			sum += val.doubleValue();
		}
		return sum;
	}

	public static void main(String[] args) {
		GenericUtil genericUtil = new GenericUtil();
		System.out.println(genericUtil.maximum("abc", "xyz", "jkl"));
		System.out.println(genericUtil.maximum(30, 10, 20));
		Integer arr[] = { 5, 0, 15 };
		System.out.println(genericUtil.sum(arr));
		Double arr2[] = { 5.5, 4.7, 7.7, 8.9 };
		System.out.println(genericUtil.sum(arr2));
		Float arr3[] = { 4.5f, 5.5f, 6.8f, 6.9f };
		System.out.println(genericUtil.sum(arr3));
	}

}
