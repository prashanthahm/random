package com.xworkz.repository;

import com.xworkz.annotation.Pal;

import com.xworkz.entity.Clutch;

@Pal
public interface ClutchRepository {
	
	boolean save(Clutch entity);

}
