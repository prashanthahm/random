package com.xworkz.client.rules;

public class ClientPal {

	public static void main(String[] args) {
	
		ClientRules clientRules = new CompanyClientRules();
		
		 CorporateClient  corporateClient = new CorporateClient(clientRules);
		corporateClient.checkRules();

	}

}
