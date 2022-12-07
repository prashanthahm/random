package com.xworkz.service;

import com.xworkz.annotation.Pal;

import com.xworkz.entity.Radiator;

@Pal
public interface RadiatorService {
	boolean validateAndSave(Radiator entity);

}
