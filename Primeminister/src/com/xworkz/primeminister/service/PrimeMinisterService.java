package com.xworkz.primeminister.service;

import javax.naming.InvalidNameException;

public interface PrimeMinisterService {
	
	boolean checkAndValidate(String name) throws InvalidNameException;

}
