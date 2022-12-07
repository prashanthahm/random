package com.xworkz.repository;

import com.xworkz.annotation.Pal;

import com.xworkz.entity.Radiator;

@Pal
public interface RadiatorRepository {

	boolean save(Radiator entity);
}
