package com.xworkz.service;

import java.util.List;

import com.xworkz.supermarketdto.SuperMarketDTO;

public interface SuperMarketService {
	
	boolean validateAndSave(SuperMarketDTO dto);
	void displayByName (String name);
	boolean validateAndSave(List<SuperMarketDTO> list);
	
	SuperMarketDTO findByName(String name);
	
	SuperMarketDTO findById(int id);
	
	List<SuperMarketDTO> findAll();
	
	List<SuperMarketDTO> findByType(String type);
	
	List<SuperMarketDTO> findByPincodeAndType(String type, int pincode);
	int totalCount();


}
