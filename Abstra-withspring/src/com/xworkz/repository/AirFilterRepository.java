package com.xworkz.repository;

import com.xworkz.annotation.Pal;
import com.xworkz.entity.AirFilter;

@Pal
public interface AirFilterRepository {
	boolean save(AirFilter entity);

}
