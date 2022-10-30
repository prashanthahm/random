package com.xworkz.enumdetail;

public enum Account {
	
URL("jdbc:mysql://localhost:3306/"),USERNAME("root"),SECRET("root");
	
	private String values;
	
	private Account(String values) {
		this.values=values;
	}
	
	public String getValues() {
		return values;
	}


}
