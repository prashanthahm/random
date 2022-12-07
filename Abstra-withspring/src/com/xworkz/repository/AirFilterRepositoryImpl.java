package com.xworkz.repository;

import java.util.Enumeration;

import com.xworkz.annotation.Pal;
import com.xworkz.entity.AirFilter;

@Pal
public abstract class AirFilterRepositoryImpl implements AirFilterRepository {
	
	@Override
	public boolean save(AirFilter entity) {
		System.out.println("entity save haagtha ide");
		return false;
	}

}
