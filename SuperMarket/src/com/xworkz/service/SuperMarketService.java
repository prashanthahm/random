package com.xworkz.service;

import java.util.List;

import com.xworkz.supermarketdto.SuperMarketDTO;

public interface SuperMarketService {
	
	boolean validateAndSave(SuperMarketDTO dto);
	void displayByName (String name);
	boolean validateAndSave(List<SuperMarketDTO> list);

}
