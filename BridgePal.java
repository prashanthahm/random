class BridgePal{

public static void main(String [] arges)
{
Bridge hanging=new Bridge();
	System.out.println(hanging.nameOfBridge);
System.out.println(hanging.placeOfBridge);
System.out.println(hanging.noOfCables);
System.out.println(hanging.costOfBridge);
System.out.println(hanging.lengthOfBridge);
System.out.println(hanging.conditionOfBridgeGood);
System.out.println(hanging.widthOfBridge);
System.out.println(hanging.cityWereInBridge);	
	
	System.out.println("Re instantiation=====================================");
	
hanging.nameOfBridge="Hanging Bridge";
hanging.placeOfBridge="KR Puram";
hanging.noOfCables=36;
hanging.costOfBridge=40000000;	
hanging.lengthOfBridge=3;	
hanging.conditionOfBridgeGood=true;	
hanging.widthOfBridge=80;	
hanging.cityWereInBridge="Banglore";

System.out.println(hanging.nameOfBridge);
System.out.println(hanging.placeOfBridge);
System.out.println(hanging.noOfCables);
System.out.println(hanging.costOfBridge+ "crore");
System.out.println(hanging.lengthOfBridge+"KM");
System.out.println(hanging.conditionOfBridgeGood);
System.out.println(hanging.widthOfBridge+"M");
System.out.println(hanging.cityWereInBridge);


	
}	
	
	
	
}