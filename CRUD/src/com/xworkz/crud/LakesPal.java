package com.xworkz.crud;

public class LakesPal {

	public static void main(String[] args) {
	
		LakeImplementation lakeImplementation = new LakeImplementation();
		lakeImplementation.save("kr puram");
		lakeImplementation.save("hosur");
		lakeImplementation.save("madiwala");
		lakeImplementation.save("anepalya");
		lakeImplementation.save("hsr");
		lakeImplementation.save("yeshwanthpur");
		lakeImplementation.save("mathikere");
		lakeImplementation.save("bellandur");
		lakeImplementation.save("hebbal");
		
		System.out.println("=============lakes name========");

		lakeImplementation.printAllLakes();
		
		lakeImplementation.updateByIndex("malleshwaram", 9);
		System.out.println("=============After Update ========");
		
		lakeImplementation.printAllLakes();
		
		lakeImplementation.deleteByIndex(2);
		
		System.out.println("=============Afterdelete by index========");
		
		lakeImplementation.printAllLakes();
		
		lakeImplementation.updateByName("hosur", "vijayanagar");
		
		System.out.println("=============After update by name========");
		
		lakeImplementation.printAllLakes();

	}

}
