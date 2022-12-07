package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.xworkz.annotation.Pal;
import com.xworkz.entity.Clutch;

import com.xworkz.repository.ClutchRepository;

@Pal
public class ClutchServiceImpl implements ClutchService {

	
	@Autowired
	@Qualifier("clutchtRepository")
	ClutchRepository repo;
	
	@Override
	public boolean validateAndSave(Clutch entity) {
		System.out.println("validate haagi save methos call maadtha ide");
		repo.save(entity);
		return false;
	}

}
