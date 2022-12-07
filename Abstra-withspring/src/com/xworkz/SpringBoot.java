package com.xworkz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.Configuration.SpringConfiguration;
import com.xworkz.service.AirFilterService;
import com.xworkz.service.AlternatorService;
import com.xworkz.service.AxleService;
import com.xworkz.service.BumperService;
import com.xworkz.service.CamShaftService;
import com.xworkz.service.ClutchService;
import com.xworkz.service.CrankShaftService;
import com.xworkz.service.MufflerService;
import com.xworkz.service.RadiatorService;
import com.xworkz.service.SparkPlugService;

public class SpringBoot {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		AirFilterService bean = context.getBean(AirFilterService.class);
		System.out.println(bean.validateAndSave(null));
		
		AlternatorService bean1 = context.getBean(AlternatorService.class);
		System.out.println(bean1.validateAndSave(null));
		
		
		AxleService bean2 = context.getBean(AxleService.class);
		System.out.println(bean2.validateAndSave(null));
		
		BumperService bean3 = context.getBean(BumperService.class);
		System.out.println(bean3.validateAndSave(null));
		
		CamShaftService bean4 = context.getBean(CamShaftService.class);
		System.out.println(bean4.validateAndSave(null));
		
		ClutchService bean5 = context.getBean(ClutchService.class);
		System.out.println(bean5.validateAndSave(null));
		
		CrankShaftService bean6 = context.getBean(CrankShaftService.class);
		System.out.println(bean6.validateAndSave(null));
		
		MufflerService bean7 = context.getBean(MufflerService.class);
		System.out.println(bean7.validateAndSave(null));
		
		RadiatorService bean8 = context.getBean(RadiatorService.class);
		System.out.println(bean8.validateAndSave(null));
		
		SparkPlugService bean9 = context.getBean(SparkPlugService.class);
		System.out.println(bean9.validateAndSave(null));

	}

}
