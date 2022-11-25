package com.xworkz.entity.primary;

import org.springframework.stereotype.Component;

@Component
public class Wire {

	public Wire() {
		System.out.println(getClass().getSimpleName());
	}

	public void passesCurrent() {
		System.out.println("Wire is passing current");
	}
}
