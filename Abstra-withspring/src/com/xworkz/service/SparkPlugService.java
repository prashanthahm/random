package com.xworkz.service;

import com.xworkz.annotation.Pal;

import com.xworkz.entity.SparkPlug;

@Pal
public interface SparkPlugService {
	boolean validateAndSave(SparkPlug entity);

}
