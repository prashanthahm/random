package com.xworkz.cricketdto.sup;

public class CricketPal {

	public static void main(String[] args) {
	CricketDTO cricket1 = new CricketDTO();
	
	cricket1.setNameOfTeam("India");
	 cricket1.setNoOfBatsmans(5);
	 cricket1.setNoOfBowlers(4);
	 cricket1.setNoOfAlrounders(2);
	 cricket1.setNoOfWickets(6);
	 cricket1.setNoOfExtraPlayers(5);
	 cricket1.setNoOfFastBowlers(3);
	 cricket1.setNoOfSpinners(2);
	 cricket1.setCaptain("Sachin");
	 cricket1.setCoach("shastri");
	 
	 CricketDTO cricket2 = new CricketDTO();
		
		cricket2.setNameOfTeam("Newzeland");
		 cricket2.setNoOfBatsmans(5);
		 cricket2.setNoOfBowlers(4);
		 cricket2.setNoOfAlrounders(3);
		 cricket2.setNoOfWickets(5);
		 cricket2.setNoOfExtraPlayers(3);
		 cricket2.setNoOfFastBowlers(4);
		 cricket2.setNoOfSpinners(3);
		 cricket2.setCaptain("Williamson");
		 cricket2.setCoach("Gary");

		 
		 if(cricket1.hashCode()==cricket2.hashCode()) {
			 cricket1.equals(cricket2);
			 System.out.println("Both are same");
			 }
		 else
		 {
			 System.out.println("Both are not same");
		 }
		}
	 
	}
	


