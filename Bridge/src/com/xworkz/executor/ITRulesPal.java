package com.xworkz.executor;

import com.xworkz.bridge.*;
import com.xworkz.supporter.*;

public class ITRulesPal {

	public static void main(String[] args) {
		
		
		Object object = new ITRulesFollower();
		
		if(object instanceof ITRulesFollower) {
		
		
		ITRulesFollower stage1 = (ITRulesFollower)object;
		stage1.harrasment();
		System.out.println(stage1.applyLeaves());
		System.out.println(stage1.harrasment());
		System.out.println(stage1.parkingApproval());
		System.out.println(stage1.informLeave());
		System.out.println(stage1.swipCard());
		System.out.println(stage1.wfh());
		
		}
	
		System.out.println("stage1------------------------------------");
		HRRules hrRules = new ITRulesFollower();
		
		if(hrRules instanceof ITRulesFollower)
		{
			ITRulesFollower stage2 = (ITRulesFollower)hrRules;
			System.out.println(stage2.applyLeaves());
			System.out.println(stage2.harrasment());
			System.out.println(stage2.parkingApproval());
			System.out.println(stage2.informLeave());
			System.out.println(stage2.swipCard());
			System.out.println(stage2.wfh());
		}
		
		System.out.println("stage2------------------------------------");
		
		ManagerRules managerRules  = new ITRulesFollower();
		if(managerRules instanceof ITRulesFollower) {
			ITRulesFollower stage3 = (ITRulesFollower)managerRules;
			System.out.println(stage3.applyLeaves());
			System.out.println(stage3.harrasment());
			System.out.println(stage3.parkingApproval());
			System.out.println(stage3.informLeave());
			System.out.println(stage3.swipCard());
			System.out.println(stage3.wfh());
		}

		System.out.println("stage3------------------------------------");
		
		SecurityRules securityRules  = new ITRulesFollower();
		if(securityRules instanceof ITRulesFollower) {
			ITRulesFollower stage4 = (ITRulesFollower)securityRules;
			System.out.println(stage4.applyLeaves());
			System.out.println(stage4.harrasment());
			System.out.println(stage4.parkingApproval());
			System.out.println(stage4.informLeave());
			System.out.println(stage4.swipCard());
			System.out.println(stage4.wfh());
		}
		
		System.out.println("stage4------------------------------------");
		
		ITRulesFollower follower  = new ITRulesFollower();
		if(follower instanceof ITRulesFollower) {
			ITRulesFollower stage5 = (ITRulesFollower)follower;
			System.out.println(stage5.applyLeaves());
			System.out.println(stage5.harrasment());
			System.out.println(stage5.parkingApproval());
			System.out.println(stage5.informLeave());
			System.out.println(stage5.swipCard());
			System.out.println(stage5.wfh());
		}
		System.out.println("stage5------------------------------------");
	}
	

}
