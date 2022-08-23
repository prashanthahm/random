package com.xworkz.Inheritance.sub;

import com.xworkz.Inheritance.sup.Market;

public class SuperMarket extends Market {
	
	public String superMarketName;
	public String superMarketInCity;
	public int superMarketClosingTime;
	public String typeOfMarket;


	public SuperMarket() {
		
	}
	public SuperMarket(String name, String location, int opentime,String superMarketName,String superMarketInCity,int superMarketClosingTime) {
		super(name, location, opentime);
		this.superMarketName=superMarketName;
		this.superMarketInCity=superMarketInCity;
		this.superMarketClosingTime=superMarketClosingTime;
		
	}
	

	public void torisu() {
		
		System.out.println(super.name);
		System.out.println(super.location);
		System.out.println(super.opentime);
		System.out.println(this.superMarketName);
		System.out.println(this.superMarketInCity);
		System.out.println(this.superMarketClosingTime);
	}
	
	
	
 
}
