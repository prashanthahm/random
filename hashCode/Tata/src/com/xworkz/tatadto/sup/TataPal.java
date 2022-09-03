package com.xworkz.tatadto.sup;



public class TataPal {

	public static void main(String[] args) {
		TataDTO tata1 = new TataDTO();
		 tata1.setName("Ratan tata");
		 tata1.setIndestrie("Automobiles");
		 tata1.setAge(70);
		 tata1.setNoOfBranches(1);
		 tata1.setPlace("Karnataka");
		 tata1.setCity("Hubli");
		 tata1.setNoOfStaff(500);
		 tata1.setNoOfBusiness(15);
		 tata1.setNoOfNationsTravelled(15);
		 tata1.setProduct("Automobile");
		 
		 TataDTO tata2 = new TataDTO();
		 tata2.setName("Ratan");
		 tata2.setIndestrie("Automobiles");
		 tata2.setAge(70);
		 tata2.setNoOfBranches(5);
		 tata2.setPlace("Haryana");
		 tata2.setCity("Gurgao");
		 tata2.setNoOfStaff(5000);
		 tata2.setNoOfBusiness(13);
		 tata2.setNoOfNationsTravelled(20);
		 tata2.setProduct("Auto");
		 
		 if(tata1.hashCode()==tata2.hashCode()) {
			 tata1.equals(tata2);
			 System.out.println("Both are same");
			 }
		 else
		 {
			 System.out.println("Both are not same");
		 }

	}


	}


