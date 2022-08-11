class BusStopPal
{
	public static void main(String[] dot)
	{
	BusStop BusStop=new BusStop("BOMMANAHALLI","MEJASTIC","JAYANAGAR");
	
	String[] passengers={"arvind","naveen","ranjan","divya"};
	
	double[] timeSlats={7.9,7.10,4.5,9.9};
	
	BusStop.setBench(10);

	BusStop.settPassengerTime(passengers,timeSlats);
	
	BusStop.printDate();
	
	}



}