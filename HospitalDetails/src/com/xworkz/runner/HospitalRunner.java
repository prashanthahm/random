package com.xworkz.runner;

import com.xworkz.hospitalDTO.HospitalDTO;
import com.xworkz.service.HospitalService;
import com.xworkz.service.HospitalServiceImp;

public class HospitalRunner {

	public static void main(String[] args) {
		
		HospitalDTO hospitalDTO = new HospitalDTO(1, "Java Deva", "Cardiac", "CN Manjunath", 1970);
		
		HospitalService hs = new HospitalServiceImp();
		hs.vaildateAndSave(hospitalDTO);

	}

}
