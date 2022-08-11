class ParkPal{

public static void main(String[] arges)
{
	
	Park pr=new Park();
	System.out.println(pr.placeOfPark);
System.out.println(pr.nameOfPark);
System.out.println(pr.noOfTreesInPark);
System.out.println(pr.noOfEntranceToThePark);
System.out.println(pr.feeForPark);
System.out.println(pr.parkDistribution);
System.out.println(pr.noOfBenchesInPark);
System.out.println(pr.gradeOfPark);
	
	
	System.out.println("Re instantiation=====================================");
	
pr.placeOfPark="Banglore";
pr.nameOfPark="JP Park";
pr.noOfTreesInPark=4500;
pr.noOfEntranceToThePark=4;	
pr.feeForPark=false;
pr.parkDistribution=7;	
pr.noOfBenchesInPark=200;	
pr.gradeOfPark='A';	
	
System.out.println(pr.nameOfPark);
System.out.println(pr.noOfTreesInPark);
System.out.println(pr.noOfEntranceToThePark);
System.out.println(pr.feeForPark);
System.out.println(pr.parkDistribution +"KM");
System.out.println(pr.noOfBenchesInPark);
System.out.println(pr.gradeOfPark);	
}




}