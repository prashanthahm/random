class BusStop{
	String stopName;
	String startingPoint;
	String endingPoing;
	int totalBench;
	String[] passangerName;
	double[] timeOfArrival;
	
	
	BusStop(){}
	BusStop(String stopName,String startingPoint,String endingPoing){
		this.stopName=stopName;
		this.startingPoint=startingPoint;
		this.endingPoing=endingPoing;
	}
	void setBench(int totalBench){
		this.totalBench=totalBench;
	}
	void settPassengerTime(String[] passangerName,double[] timeOfArrival){
		this.passangerName=passangerName;
		this.timeOfArrival=timeOfArrival;
	}
	void printDate()
	{
		System.out.println("name of the stop is   :"+this.stopName);
		System.out.println("bus starting point is :"+this.startingPoint);
		System.out.println("bus ending    poin is :"+this.endingPoing);
	System.out.println("no of benches :"+this.totalBench);
		
		for(int die=0;die<this.passangerName.length;die++)
		{
			System.out.println(this.passangerName[die]);
			
		}
		for(int die=0;die<this.timeOfArrival.length;die++)
		{
			System.out.println(this.timeOfArrival[die]);
		}
	}
	
}