class Founder
{
	String name;
	String from;
	Profession profession; 
	int since;
	boolean alive;
	int income;
	
	void setFounder(String name,String from,Profession profession,int since,
	                boolean alive,int income)
	{
		this.name=name;
		this.from=from;
		this.profession=profession;
		this.since=since;
		this.alive=alive;
		this.income=income;
	}
	
	void printDatas()
	{
		System.out.println(this.name);
		System.out.println(this.from);
		System.out.println(this.profession.value);
		System.out.println(this.since);
		System.out.println(this.alive);
		System.out.println(this.income);
	}
}