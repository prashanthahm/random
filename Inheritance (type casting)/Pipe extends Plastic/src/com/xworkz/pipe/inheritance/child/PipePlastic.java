package com.xworkz.pipe.inheritance.child;

import com.xworkz.pipe.inheritance.parent.Plastic;

public class PipePlastic extends Plastic {

	public double dia;
	public double length;
	public int layers;

	public PipePlastic(double dia, double length, int layers) {
		super(true, true, 75);
		super.cost = cost;
		super.shockResistant = shockResistant;
		super.waterResistant = waterResistant;
		this.length = length;
		this.dia = dia;
		this.layers = layers;
	}

	public void torisu() {
		System.out.println(this.length);
		System.out.println(this.dia);
		System.out.println(this.layers);
		System.out.println(super.cost);
		System.out.println(super.shockResistant);
		System.out.println(super.waterResistant);

	}

}
