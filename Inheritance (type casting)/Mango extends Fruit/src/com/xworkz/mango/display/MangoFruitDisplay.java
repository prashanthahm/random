package com.xworkz.mango.display;


import com.xworkz.mango.inheritance.child.MangoFruit;
import com.xworkz.mango.inheritance.parent.Fruit;

public class MangoFruitDisplay {

	public static void main(String[] args) {
		
		MangoFruit mango = new MangoFruit(0, null, false);
		Fruit fruit = new MangoFruit(0, null, false);
		MangoFruit convert = (MangoFruit) mango;
		convert.name = "Apple";
		convert.seed = true;
		convert.taste = "Sweet";
		convert.torisu();

		

	}

}
