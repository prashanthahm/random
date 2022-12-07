package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.xworkz.annotation.Pal;
import com.xworkz.entity.Axle;

import com.xworkz.repository.AxleRepository;

@Pal
public class AxleServiceImpl implements AxleService {

	@Autowired
	@Qualifier("axleRepository")
	AxleRepository repo;
	
	@Override
	public boolean validateAndSave(Axle entity) {
		System.out.println("validate haagi save methos call maadtha ide");
		repo.save(entity);
		return false;
	}

}
