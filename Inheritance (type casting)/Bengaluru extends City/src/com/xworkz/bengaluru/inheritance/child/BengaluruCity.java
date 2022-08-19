package com.xworkz.bengaluru.inheritance.child;

import com.xworkz.bengaluru.inheritance.parent.City;

public class BengaluruCity extends City{
	
	public double noOfWards;
	public boolean capital;
	public String language;

	public BengaluruCity(double noOfWards, boolean capital, String language) {
		super("Bengaluru", 741, 13193035);
		super.name = name;
		super.area = area;
		super.population = population;
		this.noOfWards = noOfWards;
		this.capital = capital;
		this.language = language;

	}

	public void torisu() {
		System.out.println(this.noOfWards);
		System.out.println(this.capital);
		System.out.println(this.language);
		System.out.println(super.name);
		System.out.println(super.area);
		System.out.println(super.population);

	}

}
