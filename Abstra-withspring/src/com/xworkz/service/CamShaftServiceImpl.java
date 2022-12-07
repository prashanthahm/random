package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.xworkz.annotation.Pal;
import com.xworkz.entity.CamShaft;
import com.xworkz.repository.CamShaftRepository;

@Pal
public class CamShaftServiceImpl implements CamShaftService {
	
	@Autowired
	@Qualifier("camShaftRepository")
	CamShaftRepository repo;

	@Override
	public boolean validateAndSave(CamShaft entity) {
		System.out.println("validate haagi save methos call maadtha ide");
		repo.save(entity);
		return false;
	}

}
