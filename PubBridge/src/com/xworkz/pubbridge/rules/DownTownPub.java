package com.xworkz.pubbridge.rules;

public class DownTownPub {
	
	private PubRules pubRules;

	public DownTownPub(PubRules pubRules) {
		super();
		this.pubRules = pubRules;
	}
	
	public void checkRules() {
		
		System.out.println("checking the rules");
		
		boolean dcode=pubRules.dressCodefollowed();
		int age=pubRules.age();
		boolean id=pubRules.validProof();
		if(dcode && age>21 && id) {
			
			System.out.println("Rules are followed");
		}else {
			System.err.println("Rules are not followed");
		}
	}

}
