package com.xworkz.supermarketdto;

public enum EnumDetails {

	URL("jdbc:mysql://localhost:3306/student"),USERNAME("root"),SECRET("root");
	
	private String values;
	
	private EnumDetails(String values) {
		this.values=values;
	}
	
	public String getValues() {
		return values;
	}

	
	

	
	
}
