package com.xworkz.service;

import com.xworkz.annotation.Pal;

import com.xworkz.entity.Alternator;

@Pal
public interface AlternatorService {

	boolean validateAndSave(Alternator entity);
}
