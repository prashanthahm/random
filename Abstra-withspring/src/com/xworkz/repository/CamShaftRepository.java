package com.xworkz.repository;

import com.xworkz.annotation.Pal;

import com.xworkz.entity.CamShaft;

@Pal
public interface CamShaftRepository {
	
	boolean save(CamShaft entity);

}
