package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.xworkz.annotation.Pal;
import com.xworkz.entity.Muffler;

import com.xworkz.repository.MufflerRepository;
@Pal
public class MufflerServiceImpl implements MufflerService {

	
	@Autowired
	@Qualifier("mufflerRepository")
	MufflerRepository repo;
	
	@Override
	public boolean validateAndSave(Muffler entity) {
		System.out.println("validate haagi save methos call maadtha ide");
		repo.save(entity);
		return false;
	}

}
