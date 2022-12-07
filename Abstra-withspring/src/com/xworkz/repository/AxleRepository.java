package com.xworkz.repository;

import com.xworkz.annotation.Pal;

import com.xworkz.entity.Axle;

@Pal
public interface AxleRepository {
	boolean save(Axle entity);
}
