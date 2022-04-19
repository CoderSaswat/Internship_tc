package com.oop.assgn1;

public class SuperHero extends Human {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void fly() {
		System.out.println("SuperHero can flew");
	}

	public void invisible() {
		System.out.println("Superman became invisible");
	}

	public void throwHeatRays() {
		System.out.println("superman threw hit rays from its eyes");
	}

}
