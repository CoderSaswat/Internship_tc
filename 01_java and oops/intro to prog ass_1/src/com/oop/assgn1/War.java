package com.oop.assgn1;

public class War {

	private SuperHero superHero;
	private Wizard wizard;
	private Alien alien;
	private Human human;

	public War(SuperHero superHero, Wizard wizard, Alien alien, Human human) {
		super();
		this.superHero = superHero;
		this.wizard = wizard;
		this.alien = alien;
		this.human = human;
	}

	public void startWar() {
		alien.superGammaEnergy();
		superHero.invisible();
		wizard.throwMagicalSpell();
		alien.fly();
		alien.highPowerStrength();
		wizard.fastRunning();
		superHero.throwHeatRays();
		wizard.throwFireBalls();
		human.shoot();
	}

	public void endWar() {
		System.out.println("Alien dead war won by Human");
	}

	public static void main(String[] args) {
		SuperHero superHero = new SuperHero();
		superHero.setName("iron man");

		Wizard wizard = new Wizard();
		wizard.setName("doctor strange");

		Human human = new Human();
		human.setName("saswat kumar");

		Alien alien = new Alien();

		War war = new War(superHero, wizard, alien, human);

		war.startWar();
		war.endWar();

	}

}
