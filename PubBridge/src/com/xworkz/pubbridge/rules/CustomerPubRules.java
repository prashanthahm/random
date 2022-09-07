package com.xworkz.pubbridge.rules;

public class CustomerPubRules implements PubRules {
	
	@Override
	public boolean dressCodefollowed() {
		System.out.println("calling dressCodefollowed");
		return true;
	}

	@Override
	public int age() {
		System.out.println("calling age");
		return 30;
	}

	@Override
	public boolean validProof() {
		System.out.println("calling validProof");
		return true;
	}


}
