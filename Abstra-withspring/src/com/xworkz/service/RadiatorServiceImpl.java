package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.xworkz.annotation.Pal;
import com.xworkz.entity.Radiator;

import com.xworkz.repository.RadiatorRepository;

@Pal
public class RadiatorServiceImpl implements RadiatorService {

	
	@Autowired
	@Qualifier("radiatorRepository")
	RadiatorRepository repo;
	
	@Override
	public boolean validateAndSave(Radiator entity) {
		System.out.println("validate haagi save methos call maadtha ide");
		repo.save(entity);
		return false;
	}

}
