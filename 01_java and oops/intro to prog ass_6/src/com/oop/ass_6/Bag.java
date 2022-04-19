package com.oop.ass_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Bag<T extends Number> {

	ArrayList<T> arr = new ArrayList<T>();

	public void add(T n) {
		arr.add(n);
	}

	public T get() {
		Random rand = new Random();
		int rand_int = rand.nextInt(arr.size());
		T myRandam = arr.get(rand_int);
		return myRandam;
	}

	public int size() {
		return arr.size();
	}

	public boolean isEmpty() {
		return arr.isEmpty();
	}

	public boolean contains(T n) {
		return arr.contains(n);
	}

	public void remove(T n) {
		arr.removeAll(Collections.singleton(n));
	}

	public int count(T n) {
		int count = 0;
		for (T val : arr) {
			if (n.equals(val)) {
				count++;
			}
		}
		return count;
	}

	public void display() {
		for (T i : arr) {
			System.out.println(i + " ");
		}
	}

	public static void main(String[] args) {

		Bag<Number> bag = new Bag<Number>();
		bag.add(98l);
		bag.add(13.6);
		bag.add(13.6);
		bag.add(9);
		bag.add(9);
		bag.add(4.5d);
		bag.display();
		System.out.println(bag.get());
		System.out.println(bag.size());
		System.out.println(bag.isEmpty());
		System.out.println(bag.contains(4.5));
		bag.remove(9);
		bag.display();
		System.out.println(bag.count(13.6));

	}

}
