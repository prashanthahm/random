package com.xworkz.service;

import com.xworkz.annotation.Pal;

import com.xworkz.entity.Muffler;

@Pal
public interface MufflerService {

	boolean validateAndSave(Muffler entity);
}
