package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.xworkz.annotation.Pal;
import com.xworkz.entity.AirFilter;
import com.xworkz.repository.AirFilterRepository;

@Pal
public class AirFilterServiceImpl implements AirFilterService {

	@Autowired
	@Qualifier("airFilterRepository")
	AirFilterRepository repo;
	
	@Override
	public boolean validateAndSave(AirFilter entity) {
		System.out.println("validate haagi save methos call maadtha ide");
		repo.save(entity);
		return false;
	}

}
