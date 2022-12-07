package com.xworkz.service;

import com.xworkz.annotation.Pal;
import com.xworkz.entity.Clutch;


@Pal
public interface ClutchService {

	boolean validateAndSave(Clutch entity);
	
}
