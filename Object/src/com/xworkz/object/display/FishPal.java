package com.xworkz.object.display;

import com.xworkz.object.main.Fish;

public class FishPal {

	public static void main(String[] args) {
		
		Fish fish = new Fish("Tiger", "fresh water");
		System.out.println(fish);
		fish.getBreed();
		fish.getType();

		Fish fish2 = new Fish("Tiger", "fresh water");
		System.out.println(fish.equals(fish2));
	}

}
