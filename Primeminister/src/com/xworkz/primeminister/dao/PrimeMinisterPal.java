package com.xworkz.primeminister.dao;

import javax.naming.InvalidNameException;

import com.xworkz.primeminister.service.InvalidCheckIndexException;
import com.xworkz.primeminister.service.PrimeMinisterService;
import com.xworkz.primeminister.service.PrimeMinisterServiceImpl;

public class PrimeMinisterPal {

	public static void main(String[] args) {
		
		
		PrimeMinisterDAO dao = new PrimeMinisterDAOImpl();

		PrimeMinisterService ministerService = new PrimeMinisterServiceImpl(dao);
		try {
			ministerService.checkAndValidate("Jawahar Lal Nehru");
			ministerService.checkAndValidate("Atal Bihari Vajpayee");
			ministerService.checkAndValidate("Narendra Modi");
			ministerService.checkAndValidate("Lal Bahadur Shastri");
		
		} catch (InvalidNameException ine) 
		
		
		{
			ine.getMessage();
			ine.getClass();
			
		} catch (InvalidCheckIndexException icie) {
			icie.getMessage();
		}

	}


	}


