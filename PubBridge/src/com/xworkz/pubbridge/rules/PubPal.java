package com.xworkz.pubbridge.rules;

public class PubPal {

	public static void main(String[] args) {
		
	PubRules pubRules = new CustomerPubRules();
			
			DownTownPub downTownPub = new DownTownPub(pubRules);
			downTownPub.checkRules();
		}


	}


