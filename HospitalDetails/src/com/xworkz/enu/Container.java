package com.xworkz.enu;

public enum Container {
	
	URL("jdbc:mysql://localhost:3306/bank"),USERNAME("root"),HIDE("Xworkzodc@123");
	
	private String Container;
	
	Container(String string) {
		// TODO Auto-generated constructor stub
	}

public String getContainer() {
	return Container;
}

}
