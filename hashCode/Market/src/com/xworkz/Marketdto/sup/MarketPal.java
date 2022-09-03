package com.xworkz.Marketdto.sup;

public class MarketPal {

	public static void main(String[] args) {
	
		MarketDTO market1 = new MarketDTO();
		
		market1.setNameOfMarket("Malleshwaram");
		 market1.setSpecialFor("Flowers");
		 market1.setSince(1980);
		 market1.setWard(45);
		 market1.setPlace("Karnataka");
		 market1.setCity("Bengaluru");
		 market1.setNoOfSellers(200);
		 market1.setNoOfShops(25);
		 market1.setNoOfCarts(10);
		 market1.setNoOfBuyersPerDay("800");
		 
		 MarketDTO market2 = new MarketDTO();
			
			market2.setNameOfMarket("KR Market");
			 market2.setSpecialFor("Flowers");
			 market2.setSince(1982);
			 market2.setWard(139);
			 market2.setPlace("Karnatak");
			 market2.setCity("Bengaluru");
			 market2.setNoOfSellers(600);
			 market2.setNoOfShops(100);
			 market2.setNoOfCarts(50);
			 market2.setNoOfBuyersPerDay("2000");
			 
			 if(market1.hashCode()==market2.hashCode()) {
				 market1.equals(market2);
				 System.out.println("Both are same");
				 }
			 else
			 {
				 System.out.println("Both are not same");
			 }
			}
		 
	}


