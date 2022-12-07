package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.xworkz.annotation.Pal;
import com.xworkz.entity.Bumper;
import com.xworkz.repository.BumperRepository;

@Pal
public class BumperServiceImpl implements BumperService {

	
	@Autowired
	@Qualifier("bumperRepository")
	BumperRepository repo;
	
	@Override
	public boolean validateAndSave(Bumper entity) {
		System.out.println("validate haagi save methos call maadtha ide");
		repo.save(entity);
		return false;
	}

}
