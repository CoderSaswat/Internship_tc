package com.oop.assgn1;

public class Wizard extends Human {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void throwMagicalSpell() {
		System.out.println("Wizard threw a magical spell");
	}

	public void fastRunning() {
		System.out.println("Wizard run away very fast");
	}

	public void throwFireBalls() {
		System.out.println("Wizard threw fire balls");
	}

}
