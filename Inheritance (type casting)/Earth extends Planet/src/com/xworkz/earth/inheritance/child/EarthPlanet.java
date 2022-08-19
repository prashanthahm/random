package com.xworkz.earth.inheritance.child;

import com.xworkz.earth.inheritance.parent.Planet;

public class EarthPlanet extends Planet{

	public boolean water;
	public boolean habitant;
	public int population;

	public EarthPlanet(boolean water, boolean habitant, int population) {
		super("Earth", "Sherical", 6731);
		this.water = water;
		this.habitant = habitant;
		this.population = population;
		super.name = name;
		super.shape = shape;
		super.radius = radius;
	}

	public void torisu() {
		System.out.println(this.water);
		System.out.println(this.habitant);
		System.out.println(this.population);
		System.out.println(super.name);
		System.out.println(super.shape);
		System.out.println(super.radius);
	}

}


