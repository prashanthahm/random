class Jail{
	String name;
	int noOfCells;
	String[] staffName;
	int noOfGate;
	
	
	Jail(){	
	}
	Jail(String name){
		this();
		this.name=name;
	}
	Jail(String name,int noOfCells){
		this(name);
		this.noOfCells=noOfCells;
	}
	void setStaffName(String[] staffName){
		this.staffName=staffName;
	}
	void setNoOfGate(int noOfGate){
		this.noOfGate=noOfGate;
	}
	void display(){
		
		System.out.println(this.name);
		
		System.out.println(this.noOfCells);
		
		System.out.println(this.noOfGate);
		
		for(int di=0;di<this.staffName.length;di++)
		
		{
			System.out.println(this.staffName[di]);
		}
		
		
		
		
	}

}