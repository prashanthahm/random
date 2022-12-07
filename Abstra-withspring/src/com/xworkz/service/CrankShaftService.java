package com.xworkz.service;

import com.xworkz.annotation.Pal;
import com.xworkz.entity.CrankShaft;


@Pal
public interface CrankShaftService {

	boolean validateAndSave(CrankShaft entity);
}
