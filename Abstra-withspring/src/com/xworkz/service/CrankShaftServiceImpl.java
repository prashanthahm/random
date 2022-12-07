package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.xworkz.annotation.Pal;
import com.xworkz.entity.CrankShaft;

import com.xworkz.repository.CrankShaftRepository;

@Pal
public class CrankShaftServiceImpl implements CrankShaftService {

	

	@Autowired
	@Qualifier("crankShaftRepository")
	CrankShaftRepository repo;
	
	@Override
	public boolean validateAndSave(CrankShaft entity) {
		System.out.println("validate haagi save methos call maadtha ide");
		repo.save(entity);
		return false;
	}

}
