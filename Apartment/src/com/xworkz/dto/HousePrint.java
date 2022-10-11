package com.xworkz.dto;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.dto.OwningType;
import com.xworkz.dto.Type;

public class HousePrint {

	public static void main(String[] args) {
	
		HouseDTO houseDTO1 = new HouseDTO(1, "nivasa", "prakruthi", Type.VILLA, 2, true, OwningType.OWN, 2500.0);
		HouseDTO houseDTO2 = new HouseDTO(2, "rajamane", "Chandana", Type.APPARTMENT, 4, false, OwningType.LEASE, 3000.0);
		HouseDTO houseDTO3 = new HouseDTO(3, "Giridhara", "giri", Type.VILLA, 2, true, OwningType.RENT, 2000.0);
		HouseDTO houseDTO4 = new HouseDTO(4, "Bhadra", "Bhadra", Type.INDIVIDUAL, 1, false, OwningType.RENT, 1500.0);
		HouseDTO houseDTO5 = new HouseDTO(5, "Parakruthi nilaya", "prakruthi", Type.INDIVIDUAL, 1, false, OwningType.RENT, 1500.0);
		HouseDTO houseDTO6 = new HouseDTO(6, "krupa", "Pragathi", Type.VILLA, 2, true, OwningType.RENT, 2550.0);
		HouseDTO houseDTO7 = new HouseDTO(7, "Adarsha nilaya", "Adi", Type.APPARTMENT, 5, false, OwningType.RENT, 4500.0);
		HouseDTO houseDTO8 = new HouseDTO(8, "Aashirvad", "Arshini", Type.VILLA, 3, true, OwningType.RENT, 2000.0);
		HouseDTO houseDTO9 = new HouseDTO(9, "Bhagya nilaya", "bhagya", Type.INDIVIDUAL, 1, true, OwningType.RENT, 1200.0);
		HouseDTO houseDTO10 = new HouseDTO(10, "nilaya", "guru", Type.APPARTMENT, 8, false, OwningType.LEASE, 3600.0);
		HouseDTO houseDTO11 = new HouseDTO(11, "Nayana nilaya", "nayan", Type.APPARTMENT, 15, false, OwningType.LEASE, 3150.0);
		HouseDTO houseDTO12 = new HouseDTO(12, "Daya nilaya", "Daya", Type.VILLA, 2, true, OwningType.OWN, 2300.0);
		HouseDTO houseDTO13 = new HouseDTO(13, "Kanana", "Sunil", Type.VILLA, 3, true, OwningType.OWN, 2200.0);
		HouseDTO houseDTO14 = new HouseDTO(14, "Brindavana", "Guru", Type.APPARTMENT, 10, true, OwningType.OWN, 4000.0);
		HouseDTO houseDTO15 = new HouseDTO(15, "Nivedita", "nivedita", Type.INDIVIDUAL, 1, false, OwningType.OWN, 1310.0);
		HouseDTO houseDTO16 = new HouseDTO(16, "vaishnavi nilaya", "vaishnavi", Type.INDIVIDUAL, 1, true, OwningType.LEASE, 1350.0);
		HouseDTO houseDTO17 = new HouseDTO(17, "Vishnu", "vishu", Type.INDIVIDUAL, 1, false, OwningType.RENT, 1200.0);
		HouseDTO houseDTO18 = new HouseDTO(18, "maya nilaya", "maya", Type.APPARTMENT, 6, true, OwningType.OWN, 3100.0);
		HouseDTO houseDTO19 = new HouseDTO(19, "Ananda nilaya", "Anand", Type.VILLA, 3, true, OwningType.OWN, 2020.0);
		HouseDTO houseDTO20 = new HouseDTO(20, "Ashraya nilaya", "Ashraya", Type.APPARTMENT, 4, false, OwningType.RENT, 3050.0);
		
		List<HouseDTO> houseDTOs = new ArrayList<HouseDTO>();
		houseDTOs.add(houseDTO1);
		houseDTOs.add(houseDTO2);
		houseDTOs.add(houseDTO3);
		houseDTOs.add(houseDTO4);
		houseDTOs.add(houseDTO5);
		houseDTOs.add(houseDTO6);
		houseDTOs.add(houseDTO7);
		houseDTOs.add(houseDTO8);
		houseDTOs.add(houseDTO9);
		houseDTOs.add(houseDTO10);
		houseDTOs.add(houseDTO11);
		houseDTOs.add(houseDTO12);
		houseDTOs.add(houseDTO13);
		houseDTOs.add(houseDTO14);
		houseDTOs.add(houseDTO15);
		houseDTOs.add(houseDTO16);
		houseDTOs.add(houseDTO17);
		houseDTOs.add(houseDTO18);
		houseDTOs.add(houseDTO19);
		houseDTOs.add(houseDTO20);
		
		
		System.out.println("============================asc by id");
		houseDTOs.stream().sorted((e1,e2)->e1.getId().compareTo(e2.getId())).forEach((e)->System.out.println(e));
		

	}

}
