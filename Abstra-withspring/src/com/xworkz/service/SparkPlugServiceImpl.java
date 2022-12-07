package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.xworkz.annotation.Pal;
import com.xworkz.entity.SparkPlug;

import com.xworkz.repository.SparkPlugRepository;

@Pal
public class SparkPlugServiceImpl implements SparkPlugService {

	
	@Autowired
	@Qualifier("sparkPlugRepository")
	SparkPlugRepository repo;
	
	@Override
	public boolean validateAndSave(SparkPlug entity) {
		System.out.println("validate haagi save methos call maadtha ide");
		repo.save(entity);
		return false;
	}

}
