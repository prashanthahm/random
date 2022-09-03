package com.xworkz.airlines.sup;



public class AirlinesPal {

	public static void main(String[] args) {
		AirlinesDTO airlines1 = new AirlinesDTO();
		 airlines1.setName("Vijay Malya");
		 airlines1.setOwnerName("vijay");
		 airlines1.setAge(70);
		 airlines1.setNoOfCases(25);
		 airlines1.setPlace("BangloreAirport");
		 airlines1.setCity("Bengaluru");
		 airlines1.setNoOfStaff(30);
		 airlines1.setNoOfTravellers(20000);
		 airlines1.setNoOfPlanes(5);
		 airlines1.setNameOfPlane("KingFisher");
		 
		 AirlinesDTO airlines2 = new AirlinesDTO();
		 airlines2.setName("Malya");
		 airlines2.setOwnerName("Ananda nithya");
		 airlines2.setAge(70);
		 airlines2.setNoOfCases(25);
		 airlines2.setPlace("MumbaiAirport");
		 airlines2.setCity("Bombay");
		 airlines2.setNoOfStaff(56);
		 airlines2.setNoOfTravellers(340000);
		 airlines2.setNoOfPlanes(8);
		 airlines2.setNameOfPlane("king");
		 
		 if(airlines1.hashCode()==airlines2.hashCode()) {
			 airlines1.equals(airlines2);
			 System.out.println("Both are same");
			 }
		 else
		 {
			 System.out.println("Both are not same");
		 }

	}


	}


