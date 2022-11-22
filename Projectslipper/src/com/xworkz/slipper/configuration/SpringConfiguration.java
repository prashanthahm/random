package com.xworkz.slipper.configuration;

import org.springframework.context.annotation.Bean;

import com.xworkz.slipper.entity.SlipperEntity;

public class SpringConfiguration {

	
	public SpringConfiguration() {
		System.out.println("running spring configuration");

	}

	@Bean
	public SlipperEntity slipperEntity() {
		SlipperEntity entity = new SlipperEntity();
		System.out.println("slipperEntity method is running");
		return entity;
	}
}
