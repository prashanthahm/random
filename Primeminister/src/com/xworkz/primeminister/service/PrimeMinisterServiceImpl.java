package com.xworkz.primeminister.service;

import javax.naming.InvalidNameException;

import com.xworkz.primeminister.dao.PrimeMinisterDAO;

public class PrimeMinisterServiceImpl implements PrimeMinisterService{
	
	private PrimeMinisterDAO dao;

	public PrimeMinisterServiceImpl(PrimeMinisterDAO dao) {
		this.dao = dao;
	}

	@Override
	public boolean checkAndValidate(String name) throws InvalidNameException {
		
		if (name != null && name.length() > 4 && name.length() < 50) {
			if (!this.dao.checkName(name)) {
				System.out.println("name is not duplicate");
				return dao.saveName(name);

			} else {
				System.err.println("name is duplicate");
				throw new InvalidNameException("it is duplicate");

			}
		} else {
			System.err.println("it is a valid name");
			throw new InvalidNameException("it is not valid");
		}
		
		
	}

}
