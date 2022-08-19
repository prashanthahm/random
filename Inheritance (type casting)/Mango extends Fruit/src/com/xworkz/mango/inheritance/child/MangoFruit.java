package com.xworkz.mango.inheritance.child;

import com.xworkz.mango.inheritance.parent.Fruit;

public class MangoFruit extends Fruit{
	public double price;
	public String color;
	public boolean seasonal;

	public MangoFruit(double price, String color, boolean seasonal) {
		super("Sweet", true, "mango");
		super.name = name;
		super.seed = seed;
		super.taste = taste;
		this.price = price;
		this.color = color;
		this.seasonal = seasonal;
	}

	public void torisu() {
		System.out.println(super.name);
		System.out.println(super.seed);
		System.out.println(super.taste);
		System.out.println(this.price);
		System.out.println(this.color);
		System.out.println(this.seasonal);
	}


}
