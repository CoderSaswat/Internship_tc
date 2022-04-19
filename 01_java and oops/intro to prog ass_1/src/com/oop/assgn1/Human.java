package com.oop.assgn1;

public class Human implements HumanBeing {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void walk() {
		System.out.println("this can walk");
	}

	@Override
	public void speak() {
		System.out.println("this can speak");
	}

	@Override
	public void run() {
		System.out.println("this can run");
	}

	public void shoot() {
		System.out.println("humans started shooting");
	}

}
