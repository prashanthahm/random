package com.xworkz.Inheritance.subsub;

import com.xworkz.Inheritance.sub.SuperMarket;

public class OnlineSuperMarket extends SuperMarket {

	public String onlineSuperMarketName;
	public String OnlineSuperMarketInCity;
	public int onlineSuperMarketDistributer;
	public String onlineSMName;
	
	public OnlineSuperMarket(String name,String location,int opentime,String superMarketName,String superMarketInCity,int superMarketClosingTime,String onlineSuperMarketName,String OnlineSuperMarketInCity, int onlineSuperMarketDistributer) 
	{
	super(name,location,opentime,superMarketName,superMarketInCity,superMarketClosingTime);	
	this.onlineSuperMarketName=onlineSuperMarketName;
	this.OnlineSuperMarketInCity=OnlineSuperMarketInCity;
	this.onlineSuperMarketDistributer=onlineSuperMarketDistributer;
	}
	

	public void torisu() {
		System.out.println(super.name);
		System.out.println(super.location);
		System.out.println(super.opentime);
		System.out.println(super.superMarketName);
		System.out.println(super.superMarketInCity);
		System.out.println(super.superMarketClosingTime);
		System.out.println(this.onlineSuperMarketName);
		System.out.println(this.OnlineSuperMarketInCity);
		System.out.println(this.onlineSuperMarketDistributer);
		
	}
}
