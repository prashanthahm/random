package com.xworkz.supporter;

import com.xworkz.bridge.HRRules;
import com.xworkz.bridge.ManagerRules;
import com.xworkz.bridge.SecurityRules;

public class ITRulesFollower implements HRRules, ManagerRules, SecurityRules {

	@Override
	public boolean applyLeaves() {
		
		return false;
	}

	@Override
	public boolean harrasment() {

		return false;
	 

}

	@Override
	public boolean informLeave() {
	
		return false;
	}

	@Override
	public boolean wfh() {
		
		return false;
	}

	@Override
	public boolean swipCard() {
		
		return false;
	}

	@Override
	public boolean parkingApproval() {
		
		return false;
	}
	}
