package com.xworkz.automobile.torisu;

import com.xworkz.automobile.base.Automobile;
import com.xworkz.automobile.base.HondaAutomobile;
import com.xworkz.automobile.sub.TataAutomobile;

public class AutomobilePal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Automobile automobile = new HondaAutomobile();
		double au = automobile.sellAccessories(null);
		System.out.println(au);
		automobile.setBrand("Honda");
		automobile.setType("Accessories");

		System.out.println("-----------------");

		HondaAutomobile hondaAutomobile = new HondaAutomobile();
		double auto= hondaAutomobile.sellAccessories("stand");
		System.out.println(auto);
		hondaAutomobile.setTime(10.30d, 7.30d);
		hondaAutomobile.setBrand("Hero");
		hondaAutomobile.setType("spares");
		hondaAutomobile.torisu();

		System.out.println("---------------------");

		TataAutomobile tata = new TataAutomobile();
		tata.setBrand("Hero");
		tata.setType("spares");
		tata.torisu();


	}

}
