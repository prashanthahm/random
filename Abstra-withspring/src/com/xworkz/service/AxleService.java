package com.xworkz.service;


import com.xworkz.annotation.Pal;
import com.xworkz.entity.Axle;

@Pal
public interface AxleService {

	boolean validateAndSave(Axle entity);
}
