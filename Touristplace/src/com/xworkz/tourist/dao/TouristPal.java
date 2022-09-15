package com.xworkz.tourist.dao;

import com.xworkz.tourist.service.NoSuchName;
import com.xworkz.tourist.service.TouristPlaceService;
import com.xworkz.tourist.service.TouristPlaceServiceImpl;

public class TouristPal {

	public static void main(String[] args) {
		
		TouristPlacesDAO dao = new TouristPlacesDAOImpl();

		TouristPlaceService service = new TouristPlaceServiceImpl(dao);
		try {
			service.validateAndSave("Hampi");
			
			service.validateAndSave("GolGubmbaj");
			
			service.validateAndSave("Tunga Bhadra Project");
			
			service.validateAndSave("Uttarakhand");
			
			service.validateAndSave("Nagarahole");
			
			service.validateAndSave("Bandipura");
			
			service.validateAndSave("KodaiCanal");
			
			service.validateAndSave("Ooty");
			
			service.validateAndSave("Agra");
			
			service.validateAndSave("Jog falls");
			
			service.validateAndSave("Mysore Fort");


		} catch (NoSuchName nsm) {
			
			System.out.println("handled");
		}

	}

	}


