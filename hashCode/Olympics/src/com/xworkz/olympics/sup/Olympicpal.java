package com.xworkz.olympics.sup;



public class Olympicpal {

	public static void main(String[] args) {
		
		OlympicsDTO olympics1 = new OlympicsDTO();
		
		olympics1.setNameOfGames("Olympic");
		 olympics1.setNoOfNations(20);
		 olympics1.setNoOfPlayersInFootball(11);
		 olympics1.setNoOfSetsInMensTennis(5);
		 olympics1.setNoOfPlayersInVollyball(7);
		 olympics1.setNoOfGoldWinByIndia(5);
		 olympics1.setNoOfSilverWinByIndia(3);
		 olympics1.setNoOfBronzeWinByIndia(2);
		 olympics1.setHost("Austrelia");
		 olympics1.setFastestRunner("Bolt");
		 
		 OlympicsDTO olympics2 = new OlympicsDTO();
			
			olympics2.setNameOfGames("Common Wealth");
			 olympics2.setNoOfNations(15);
			 olympics2.setNoOfPlayersInFootball(11);
			 olympics2.setNoOfSetsInMensTennis(5);
			 olympics2.setNoOfPlayersInVollyball(2);
			 olympics2.setNoOfGoldWinByIndia(6);
			 olympics2.setNoOfSilverWinByIndia(4);
			 olympics2.setNoOfBronzeWinByIndia(6);
			 olympics2.setHost("Srilanka");
			 olympics2.setFastestRunner("Hussain");
		 
		 

			 
			 if(olympics1.hashCode()==olympics2.hashCode()) {
				 olympics1.equals(olympics2);
				 System.out.println("Both are same");
				 }
			 else
			 {
				 System.out.println("Both are not same");
			 }
	}

}
