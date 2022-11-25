package com.xworkz.entity.primary;

import org.springframework.stereotype.Component;

@Component
public class Fan {

	public Fan() {
		System.out.println(getClass().getSimpleName());
	}

	public void rotates() {
		System.out.println("rotates the blade");
	}

}
