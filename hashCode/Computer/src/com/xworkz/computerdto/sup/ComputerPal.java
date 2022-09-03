package com.xworkz.computerdto.sup;

public class ComputerPal {

	public static void main(String[] args) {
		
   ComputerDTO computer1 = new    ComputerDTO();
   computer1.setNameOfComputer("Aplle");
	 computer1.setIndestrie("Electronics");
	 computer1.setSince(1976);
	 computer1.setNoOfBranches(27);
	 computer1.setPlace("American");
	 computer1.setCity("California");
	 computer1.setNoOfStaff(2000);
	 computer1.setNoOfBusiness(4);
	 computer1.setNoOfNationshavingBusiness(14);
	 computer1.setLogo("Apple");
	 
	 ComputerDTO computer2 = new ComputerDTO();
	 computer2.setNameOfComputer("Dell");
	 computer2.setIndestrie("Electronics");
	 computer2.setSince(1976);
	 computer2.setNoOfBranches(28);
	 computer2.setPlace("America");
	 computer2.setCity("Mountain view");
	 computer2.setNoOfStaff(2300);
	 computer2.setNoOfBusiness(6);
	 computer2.setNoOfNationshavingBusiness(15);
	 computer2.setLogo("Dell");
	 
	 if(computer1.hashCode()==computer2.hashCode()) {
		 computer1.equals(computer2);
		 System.out.println("Both are same");
		 }
	 else
	 {
		 System.out.println("Both are not same");
	 }
	}

}
