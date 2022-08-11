class AtmPal{
	
	public static void main(String [] arges)
	{
	Atm anyTime=new Atm();
System.out.println(anyTime.nameOfPlace);
System.out.println(anyTime.noofBranches);
System.out.println(anyTime.fee);
System.out.println(anyTime.nameOfBank);
System.out.println(anyTime.cardReader);
System.out.println(anyTime.nameOfCity);
System.out.println(anyTime.amount);
System.out.println(anyTime.currency);

System.out.println("Re instantiation=====================================");

anyTime.nameOfPlace="Rajajinagar";
anyTime.noofBranches=5;
anyTime.fee=true;
anyTime.nameOfBank="State Bank Of India";
anyTime.cardReader=true;
anyTime.nameOfCity="banglore";
anyTime.amount=100000;
anyTime.currency=1;


System.out.println(anyTime.noofBranches);
System.out.println(anyTime.fee);
System.out.println(anyTime.nameOfBank);
System.out.println(anyTime.cardReader);
System.out.println(anyTime.nameOfCity);
System.out.println(anyTime.amount);
System.out.println(anyTime.currency);










	}
	
	
	
	
	
	}
	