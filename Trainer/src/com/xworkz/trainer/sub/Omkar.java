package com.xworkz.trainer.sub;

import com.xworkz.trainer.main.Trainer;

public class Omkar extends Trainer {
	
	public Omkar() 
	{
		super("Omkar", 14, "Coding");

		System.out.println(super.name);
		System.out.println(super.exp);
		System.out.println(super.specialization);
		System.out.println("Default constructor in subclass============");
	}
	
	@Override
	public boolean training() {
		System.out.println("Training in sub class");
		return true;
	}
	@Override
	public boolean coding() {
		System.out.println("Training in sub class");
		return true;
	}
	
	public String getName() {
		System.out.println("Name in the sub class");
		return "RJ";
	}

	public double getExp() {
		System.out.println("Exp in the sub class");
		return 4;
	}

	public String getSpecialization() {
		System.out.println("Specialization in the sub class");
		return "Coding";
	}
	
	

}
