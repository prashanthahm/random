class HospitalCreate
{
	public static void main(String[] hospital)
	{
		String[] eqmts={"Beds","Stretchers","Surgical Tables","Monitors"};
		Hospital hosp=new Hospital("Jaya Dev",Specialization.BRIAN,eqmts);
	
		Founder f = new Founder (); 
		f.setFounder("Ramesh","B'lore",Profession.DOCTOR,1987,true,60000);
		hosp.setHospital(600,f);
		
		hosp.printData();
	}
}