package com.xworkz.swamijidto.sup;

public class SwamijiPal {

	public static void main(String[] args) {
		
		 SwamijiDTO swamiji1 = new SwamijiDTO();
		 swamiji1.setName("Nithya Anand");
		 swamiji1.setAliasName("nithya");
		 swamiji1.setAge(60);
		 swamiji1.setNoOfCases(25);
		 swamiji1.setPlace("Bidadi");
		 swamiji1.setCity("Bengaluru");
		 swamiji1.setNoOfStaff(30);
		 swamiji1.setNoOfBelevers(200000);
		 swamiji1.setNoOfBranches(4);
		 swamiji1.setNameOfAshram("Nithyashram");
		 
		 SwamijiDTO swamiji2 = new SwamijiDTO();
		 swamiji2.setName("Anand");
		 swamiji2.setAliasName("Ananda nithya");
		 swamiji2.setAge(60);
		 swamiji2.setNoOfCases(25);
		 swamiji2.setPlace("begur");
		 swamiji2.setCity("manglore");
		 swamiji2.setNoOfStaff(56);
		 swamiji2.setNoOfBelevers(340000);
		 swamiji2.setNoOfBranches(5);
		 swamiji2.setNameOfAshram("Nitiashram");
		 
		 if(swamiji1.hashCode()==swamiji2.hashCode()) {
			 swamiji1.equals(swamiji2);
			 System.out.println("Both are same");
			 }
		 else
		 {
			 System.out.println("Both are not same");
		 }

	}

}
