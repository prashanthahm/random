package com.xworkz.trainer.main;

public class Trainer {

	protected String name;
	protected double exp;
	protected String specialization;

	protected boolean training() {
		System.out.println("Training in parent class=================");
		return false;
	}
	protected boolean coding() {
		System.out.println("Training in parent class========================");
		return false;
	}
	
	protected Trainer() {
		System.out.println("Default constructor in parent class================");
	}

	protected Trainer(String name, double exp, String specialization) {
		this.name = name;
		this.exp = exp;
		this.specialization = specialization;
		System.out.println("Paramitarized constructor in parent===============");

	}
}
