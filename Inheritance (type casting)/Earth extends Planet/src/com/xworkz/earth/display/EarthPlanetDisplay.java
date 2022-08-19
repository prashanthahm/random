package com.xworkz.earth.display;


import com.xworkz.earth.inheritance.child.EarthPlanet;
import com.xworkz.earth.inheritance.parent.Planet;

public class EarthPlanetDisplay {

	public static void main(String[] args) {
		EarthPlanet earth = new EarthPlanet(true, true, 8);

		Planet planet = new EarthPlanet(false, false, 0);
		EarthPlanet convert = (EarthPlanet) planet;
		convert.name = "Jupitar";
		convert.shape = "circle";
		convert.radius = 71492;
		convert.torisu();

	}
	

}
