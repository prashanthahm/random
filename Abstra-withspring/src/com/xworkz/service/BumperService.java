package com.xworkz.service;

import com.xworkz.annotation.Pal;

import com.xworkz.entity.Bumper;

@Pal
public interface BumperService {

	boolean validateAndSave(Bumper entity);
}
