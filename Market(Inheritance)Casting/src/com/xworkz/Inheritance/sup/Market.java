package com.xworkz.Inheritance.sup;

public class Market {
	
	public String name;
	public String location;
	public int opentime;
	public Market() {
		
	}
	
public Market(String name,String location,int opentime) {
	this.name=name;
	this.location=location;
	this.opentime=opentime;
	
	System.out.println("Default constructor==========");
}
	
public void torisu() {
	
	System.out.println(this.name);
	System.out.println(this.location);
	System.out.println(this.opentime);
	
}
}


