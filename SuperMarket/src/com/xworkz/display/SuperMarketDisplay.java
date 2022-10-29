package com.xworkz.display;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.service.SuperMarketService;
import com.xworkz.service.SuperMarketServiceImpl;
import com.xworkz.supermarketdto.SuperMarketDTO;

public class SuperMarketDisplay {

	public static void main(String[] args) {
		SuperMarketDTO dto1 = new SuperMarketDTO(1, "Big Bazar", "big bazar", "52AAAAA0000A1Z5", 580021, "groceries");
		SuperMarketDTO dto2 = new SuperMarketDTO(2, "bazar", "reliance", "82AAAAA0000A1Z6", 580022, "clothing");
		SuperMarketDTO dto3 = new SuperMarketDTO(3, "Dmart", "D company", "92AAAAA0000A1Z7", 580023,"clothing and groceries");
		SuperMarketDTO dto4 = new SuperMarketDTO(4, "hyper", "reliance", "42AAAAA0000A1Z6", 580022, "clothing");
		SuperMarketDTO dto5 = new SuperMarketDTO(5, "supermarket", "big bazar", "32AAAAA0000A1Z5", 580021, "groceries");
		SuperMarketDTO dto6 = new SuperMarketDTO(6, "reliance", "reliance", "62AAAAA0000A1Z6", 580022, "clothing");
		SuperMarketDTO dto7 = new SuperMarketDTO(7, "more", "D company", "82AAAAA0000A1Z7", 580023,"clothing and groceries");
		SuperMarketDTO dto8 = new SuperMarketDTO(8, "vishal mart", "reliance", "32AAAAA0000A1Z6", 580022, "clothing");
       
		
		SuperMarketDTO dto9 = new SuperMarketDTO(207, "more", "D company", "82AAAAA0000A1Z7", 580023,"clothing and groceries");
		SuperMarketDTO dto10= new SuperMarketDTO(204, "vishal mart", "reliance", "32AAAAA0000A1Z6", 580022, "clothing");

		SuperMarketDTO dto13 = new SuperMarketDTO(209, "more", "D company", "82AAAAA0000A1Z7", 580023,"clothing and groceries");
		SuperMarketDTO dto14= new SuperMarketDTO(210, "vishal mart", "reliance", "32AAAAA0000A1Z6", 580022, "clothing");
		
		List<SuperMarketDTO> collection = new ArrayList();
		
		collection.add(dto5);
		collection.add(dto6);
		collection.add(dto7);
		collection.add(dto8);
		collection.add(dto9);
		collection.add(dto10);
		collection.add(dto13);
		collection.add(dto14);
		
		
		SuperMarketService service = new SuperMarketServiceImpl();
		//service.validateAndSave(collection);
		//service.validateAndSave(dto2);
		//service.validateAndSave(dto3);
		//service.validateAndSave(dto4);
		
		//service.displayByName("D mart");
		
		//collection.stream().forEach(ref->System.out.println(service.validateAndSave(ref)));
		
		SuperMarketDTO findByName = service.findByName("big bazar");
		System.out.println(findByName);
		
		
		System.out.println("======================");
		
		SuperMarketDTO findById = service.findById(4);
		System.out.println(findById);
		
		System.out.println("======================");
		
		List<SuperMarketDTO> findAll = service.findAll();
		findAll.forEach(ref->System.out.println(ref));
		
		System.out.println("======================");
		
		List<SuperMarketDTO> findByType = service.findByType("clothing");
		findByType.forEach(ref->System.out.println(ref));
		
		System.out.println("======================");
		
		List<SuperMarketDTO> findByPincodeAndType = service.findByPincodeAndType("clothing",580022);
		findByPincodeAndType.forEach(ref->System.out.println(ref));
		
		System.out.println("======================");
		
		service.totalCount();

	}

}
