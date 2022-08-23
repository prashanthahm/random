package com.xworkz.Inheritance.Pal;

import com.xworkz.Inheritance.sup.Market;
import com.xworkz.Inheritance.sub.SuperMarket;
import com.xworkz.Inheritance.subsub.OnlineSuperMarket;

public class MarketPal {

	public static void main(String[] args) {
		Market market=new Market ("mart","bengaluru",9);
		market.torisu();
System.out.println("====================================");

        Market market2=new SuperMarket("Super","Mangalore",10,"superamrt","Hubli",10);
        market2.torisu();
        
 System.out.println("===================================");
        SuperMarket superMarket=new SuperMarket("Supermonday","Belgaum",7,"Superorg","Mysore",11);
        superMarket.torisu();
        
        Market market3=new OnlineSuperMarket("superwednesday","Banglore2",8,"onlineorg","Mandya",12,"Dunzo","Hosakote",10);
        market3.torisu();
 System.out.println("===================================");
      SuperMarket supermarket2=new OnlineSuperMarket("supersatarday","Banglore5",8,"onlineint","Mandyaa",12,"Zomato","KGF",20);
      supermarket2.torisu();
      System.out.println("===================================");
      
      if (market2 instanceof SuperMarket) {
			SuperMarket convo = (SuperMarket)market2;
			convo.typeOfMarket = "Stock";
			convo.torisu();
		}
		else {
			System.out.println("notv ref of Supermarket.");
		}
		System.out.println("******************");
		
		if(supermarket2 instanceof OnlineSuperMarket) {
			OnlineSuperMarket convo = (OnlineSuperMarket)supermarket2;
			convo.location = "Bommanahalli";
			convo.torisu();
		}
		else {
			System.out.println("not a ref of OnlineSuperMarket");
		}
		System.out.println("**********************");
		
		if(market3 instanceof OnlineSuperMarket) {
			OnlineSuperMarket convo = (OnlineSuperMarket)market3;
			convo.onlineSMName = "AirtelMart";
			convo.torisu();
		}
		else {
			System.out.println("not aref of OnlineSuperMarket");
		}
      
      
	}
	}


