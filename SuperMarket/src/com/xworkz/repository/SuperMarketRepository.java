package com.xworkz.repository;

import java.util.List;

import com.xworkz.supermarketdto.SuperMarketDTO;

public interface SuperMarketRepository  {
	
	boolean save(SuperMarketDTO dto);
	void displayByName(String name);
	boolean save(List<SuperMarketDTO> list);


}
