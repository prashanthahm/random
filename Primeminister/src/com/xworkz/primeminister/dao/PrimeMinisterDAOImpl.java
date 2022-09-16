package com.xworkz.primeminister.dao;

import com.xworkz.primeminister.service.InvalidCheckIndexException;

public class PrimeMinisterDAOImpl implements PrimeMinisterDAO {
	
	private String[] data = new String[5];
	private int index;

	@Override
	public boolean saveName(String name) {
		
		if (this.index < this.data.length) {
			this.data[index] = name;
			System.out.println("name is saved " + name + " index " + this.index);
			index++;
			return true;
			} else {
				System.err.println("index is not valid ");
				throw new InvalidCheckIndexException("index is not valid");
			}
	}

	@Override
	public boolean checkName(String name) {
		
		for (String ref : this.data)
			if (ref != null && ref.equals(name)) {
				return true;
			}
		return false;
	}
	
	

}
