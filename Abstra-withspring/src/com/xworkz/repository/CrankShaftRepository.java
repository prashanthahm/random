package com.xworkz.repository;

import com.xworkz.annotation.Pal;

import com.xworkz.entity.CrankShaft;

@Pal
public interface CrankShaftRepository {
	
	boolean save(CrankShaft entity);

}
