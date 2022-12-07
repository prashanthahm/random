package com.xworkz.repository;

import com.xworkz.annotation.Pal;

import com.xworkz.entity.SparkPlug;

@Pal
public interface SparkPlugRepository {
	boolean save(SparkPlug entity);
}
