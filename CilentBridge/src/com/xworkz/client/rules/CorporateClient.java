package com.xworkz.client.rules;

public class CorporateClient {
	
	private ClientRules clientRules;

	public CorporateClient(ClientRules clientRules) {
		super();
		this.clientRules = clientRules;
	}
	
	public void checkRules() {
		System.out.println("checking the rules");
		
		boolean inputWork=clientRules.inputForWork();
		boolean outputWork=clientRules.outputForWork();
		double timeInDays=clientRules.timeInDays();
		
		if(inputWork && outputWork && timeInDays<21 ) {
			System.out.println("Rules are followed");
		}else {
			System.err.println("Rules are not followed");
		}
	}

}
