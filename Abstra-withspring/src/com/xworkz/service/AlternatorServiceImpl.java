package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.xworkz.annotation.Pal;
import com.xworkz.entity.Alternator;

import com.xworkz.repository.AlternatorRepository;

@Pal
public class AlternatorServiceImpl implements AlternatorService {

	@Autowired
	@Qualifier("alternatorRepository")
	AlternatorRepository repo;
	
	@Override
	public boolean validateAndSave(Alternator entity) {
		System.out.println("validate haagi save methos call maadtha ide");
		repo.save(entity);
		return false;
	}

}
