package com.xworkz.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.entity.Alternator;
import com.xworkz.repository.AirFilterRepository;
import com.xworkz.repository.AirFilterRepositoryImpl;
import com.xworkz.repository.AlternatorRepository;
import com.xworkz.repository.AlternatorRepositoryImpl;
import com.xworkz.repository.AxleRepository;
import com.xworkz.repository.AxleRepositoryImpl;
import com.xworkz.repository.BumperRepository;
import com.xworkz.repository.BumperRepositoryImpl;
import com.xworkz.repository.CamShaftRepositoryImpl;
import com.xworkz.repository.ClutchRepository;
import com.xworkz.repository.ClutchRepositoryImpl;
import com.xworkz.repository.CrankShaftRepository;
import com.xworkz.repository.CrankShaftRepositoryImpl;
import com.xworkz.repository.MufflerRepository;
import com.xworkz.repository.MufflerRepositoryImpl;
import com.xworkz.repository.RadiatorRepository;
import com.xworkz.repository.RadiatorRepositoryImpl;
import com.xworkz.repository.SparkPlugRepository;
import com.xworkz.repository.SparkPlugRepositoryImpl;

@Configuration
@ComponentScan("com.xworkz")
public class SpringConfiguration {

	@Bean
	public AlternatorRepository alternatorRepository() {
		return new AlternatorRepositoryImpl();
	}
	
	@Bean
	public AxleRepository axleRepository() {
		return new AxleRepositoryImpl();
	}
	
	//@Bean
	//public AirFilterRepository airFilterRepository() {
		//return new AirFilterRepositoryImpl();
	//}
	
	@Bean
	public BumperRepository bumperRepository() {
		return new BumperRepositoryImpl();
	}
	
	@Bean
	public CamShaftRepositoryImpl camShaftRepository() {
		return new CamShaftRepositoryImpl();
	}

	@Bean
	public ClutchRepository clutchRepository() {
		return new ClutchRepositoryImpl();
	}

	@Bean
	public CrankShaftRepository crankShaftRepository() {
		return new CrankShaftRepositoryImpl();
	}

	@Bean
	public MufflerRepository mufflerRepository() {
		return new MufflerRepositoryImpl();
	}

	@Bean
	public RadiatorRepository radiatorRepository() {
		return new RadiatorRepositoryImpl();
	}

	@Bean
	public SparkPlugRepository sparkPlugRepository() {
		return new SparkPlugRepositoryImpl();
	}

	
}

