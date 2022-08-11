class DividerPal{

public static void main(String[]arges){

Divider divid=new Divider();
System.out.println(divid.theRoadDividerInPlace);
System.out.println(divid.cityNameInWhich);
System.out.println(divid.lenthOfDivider);
System.out.println(divid.widthOfDivider);
System.out.println(divid.noOfDividerInArea);
System.out.println(divid.conditionOfDivider);
System.out.println(divid.colorOfDivider);
System.out.println(divid.ratingDivider);	
	
	System.out.println("Re instantiation=====================================");
																														
divid.theRoadDividerInPlace="Silk Board";
divid.cityNameInWhich="Banglore";
divid.lenthOfDivider=3;
divid.widthOfDivider=1;
divid.noOfDividerInArea=4;
divid.conditionOfDivider=true;
divid.colorOfDivider='B';
divid.ratingDivider='4';	
	
System.out.println(divid.theRoadDividerInPlace);
System.out.println(divid.cityNameInWhich);
System.out.println(divid.lenthOfDivider +"KM");
System.out.println(divid.widthOfDivider +"M");
System.out.println(divid.noOfDividerInArea);
System.out.println(divid.conditionOfDivider +"Good");
System.out.println(divid.colorOfDivider +  "White");
System.out.println(divid.ratingDivider);
	
	
}


}