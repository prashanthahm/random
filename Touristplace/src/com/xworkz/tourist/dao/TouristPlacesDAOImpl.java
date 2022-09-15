package com.xworkz.tourist.dao;

public class TouristPlacesDAOImpl implements TouristPlacesDAO{
	
	private String[] placeNames=new String[10];
	private int index;

	@Override
	public boolean place(String placeName) {
		this.placeNames[index] = placeName;
		System.out.println(placeName);
		this.index++;
		return false;
	}

	@Override
	public boolean checkName(String placeName) {
		for (String ref : placeNames) {
			if (ref != null && ref.equals(placeName)) {
				return true;
			} else {
				return false;
			}
		}
		
		return false;
	}

}
