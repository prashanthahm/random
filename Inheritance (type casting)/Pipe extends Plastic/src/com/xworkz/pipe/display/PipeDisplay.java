package com.xworkz.pipe.display;

import com.xworkz.pipe.inheritance.child.PipePlastic;
import com.xworkz.pipe.inheritance.parent.Plastic;

public class PipeDisplay {

	public static void main(String[] args) {

		PipePlastic pipe = new PipePlastic(25, 3, 3);
		Plastic plastic = new PipePlastic(0, 0, 0);
		PipePlastic convert = (PipePlastic) plastic;
		convert.cost = 150;
		convert.shockResistant = true;
		convert.waterResistant = true;
		convert.torisu();


	}

}
