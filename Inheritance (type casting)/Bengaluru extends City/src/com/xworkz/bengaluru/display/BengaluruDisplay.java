package com.xworkz.bengaluru.display;

import com.xworkz.bengaluru.inheritance.child.BengaluruCity;
import com.xworkz.bengaluru.inheritance.parent.City;

public class BengaluruDisplay {

	public static void main(String[] args) {
		BengaluruCity bengaluru = new BengaluruCity(0, false, null);
		City city = new BengaluruCity(0, false, null);
		BengaluruCity convert = (BengaluruCity) city;
		convert.name = "Hubli";
		convert.area = 404;
		convert.population = 1158000;
		convert.torisu();


	}

}
