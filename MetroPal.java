class MetroPal{

public static void main(String[]arges)
{
	
	Metro train=new Metro();
	System.out.println(train.PlaceWhereTheMetro);
System.out.println(train.noOfStations);
System.out.println(train.kilometersCoverd);
System.out.println(train.isGoodCondition);
System.out.println(train.noOfBlocks);
System.out.println(train.minPriceForEntrance);
System.out.println(train.cityInWhichRunning);
System.out.println(train.rating);
	
	System.out.println("Re instantiation=====================================");
	
    train.PlaceWhereTheMetro="KempegowdaMetroStation";
    train.noOfStations=10;
	train.kilometersCoverd=35;
	train.isGoodCondition=true;
	train.noOfBlocks=5;
	train.minPriceForEntrance=15;
	train.cityInWhichRunning="Banglore";
	train.rating='A';
	
System.out.println(train.PlaceWhereTheMetro);
System.out.println(train.noOfStations);
System.out.println(train.kilometersCoverd +"KM");
System.out.println(train.isGoodCondition);
System.out.println(train.noOfBlocks);
System.out.println(train.minPriceForEntrance +"RS");
System.out.println(train.cityInWhichRunning);
System.out.println(train.rating);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
}



}