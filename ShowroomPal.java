class ShowroomPal{
	

public static void main(String[] show){

System.out.println(Showroom.showroomInCity);

Showroom showr=new Showroom();
System.out.println(showr.placeOfShowroom);
System.out.println(showr.nameOfShowroom);
System.out.println(showr.noOfBranches);


Showroom showr1=new Showroom("jayanagar",7);
showr1.placeOfShowroom="jayanagar";
showr1.noOfBranches=7;
showr1.nameOfShowroom="Black & Whight";
System.out.println(showr1.placeOfShowroom);
System.out.println(showr1.nameOfShowroom);
System.out.println(showr1.noOfBranches);

Showroom showr12=new Showroom("yeshwanthpur",9);
showr12.placeOfShowroom="yeshwanthpur";
showr12.noOfBranches=9;
showr1.nameOfShowroom="Black & Whight";
System.out.println(showr12.placeOfShowroom);
System.out.println(showr12.nameOfShowroom);
System.out.println(showr12.noOfBranches);

Showroom showr13=new Showroom();
showr13.placeOfShowroom="Rajaji Nagar";
showr13.nameOfShowroom="Reebok";
showr13.noOfBranches=5;

System.out.println(showr13.placeOfShowroom);
System.out.println(showr13.nameOfShowroom);
System.out.println(showr13.noOfBranches);

Showroom showr14=new Showroom();
showr14.placeOfShowroom="HSR";
showr14.nameOfShowroom="Reebok";
showr14.noOfBranches=5;

System.out.println(showr14.placeOfShowroom);
System.out.println(showr14.nameOfShowroom);
System.out.println(showr14.noOfBranches);

}




}