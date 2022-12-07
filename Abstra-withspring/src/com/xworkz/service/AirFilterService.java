package com.xworkz.service;

import com.xworkz.annotation.Pal;
import com.xworkz.entity.AirFilter;

@Pal
public interface AirFilterService {

	boolean validateAndSave(AirFilter entity);
}
