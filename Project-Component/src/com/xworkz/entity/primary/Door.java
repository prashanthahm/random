package com.xworkz.entity.primary;

import org.springframework.stereotype.Component;

@Component
public class Door {
	
	public Door() {
		System.out.println(getClass().getSimpleName());
	}

	public void security() {
		System.out.println("provides security");
	}

	public void brightness() {
		
		
	}

}
