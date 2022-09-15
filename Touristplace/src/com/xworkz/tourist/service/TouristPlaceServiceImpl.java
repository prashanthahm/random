package com.xworkz.tourist.service;

import com.xworkz.tourist.dao.TouristPlacesDAO;



public class TouristPlaceServiceImpl implements TouristPlaceService{
	
private TouristPlacesDAO dao;
	
	public TouristPlaceServiceImpl(TouristPlacesDAO dao) {
		this.dao=dao;
	}

	@Override
	public boolean validateAndSave(String placeName) throws NoSuchName {
		if(placeName != null && placeName.length()>3 && placeName.length()<50) {
			if(this.dao.checkName(placeName)) {
				System.err.println("name already present");
				throw new NoSuchName("name exist");
			}
			else 
			
			{
				System.out.println("does not exist present");
				this.dao.place(placeName);
				return true;
			}
			
		}
		else 
		{
			System.out.println("Invalid");
			throw new NoSuchName("not a name");
			
		}
		
	}

}
