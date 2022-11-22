package com.xworkz.slipper.pal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.slipper.configuration.SpringConfiguration;
import com.xworkz.slipper.entity.SlipperEntity;

public class SpringPal {

	public static void main(String[] args) {
	
	

			ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
			SlipperEntity bean = context.getBean(SlipperEntity.class);
			bean.protectFoot();;
			
		}

	}


