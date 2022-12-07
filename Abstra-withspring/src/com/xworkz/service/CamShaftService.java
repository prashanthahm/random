package com.xworkz.service;

import com.xworkz.annotation.Pal;

import com.xworkz.entity.CamShaft;

@Pal
public interface CamShaftService {
	
	boolean validateAndSave(CamShaft entity);

}
