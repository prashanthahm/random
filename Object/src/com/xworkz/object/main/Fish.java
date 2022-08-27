package com.xworkz.object.main;

public class Fish {
	
	private String breed;
	private String type;

	protected Fish() {
		System.out.println("Default constructor==========================");
	}

	public Fish(String breed, String type) {
		this.breed = breed;
		this.type = type;
	}

	public String getBreed() {
		return this.breed;
	}

	public String getType() {
		return this.type;
	}

}
