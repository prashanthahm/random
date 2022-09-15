package com.xworkz.tourist.service;

public interface TouristPlaceService {
	
	boolean validateAndSave(String placeName) throws NoSuchName;

}
