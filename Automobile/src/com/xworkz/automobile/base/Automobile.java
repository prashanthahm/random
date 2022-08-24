package com.xworkz.automobile.base;

public class Automobile {

	public String type;
	public String brand;

	public double sellAccessories(String name) {

		if (name == "carburattor") {
			System.out.println("The price of carburattor is" );
			return 3000;
		}

		if (name == "stand") {
			System.out.println("The price of stand is");
			return 350;
		}

	System.out.println("No items");
		return 0.0;
	}

	protected Automobile() {
		System.out.println("Default constructor===========================================");
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	    protected void torisu() {
		System.out.println(type);
		System.out.println(brand);
	}
}
