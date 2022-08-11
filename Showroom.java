class Showroom{

static String showroomInCity="Banglore";
String placeOfShowroom="Rajaji Nagar";
String nameOfShowroom="Black & Whight";
int noOfBranches=5;

Showroom()
{
	System.out.println("==================================");
}

Showroom(String placeOfSho, int noOfBranch )
{
	placeOfShowroom=placeOfSho;
	noOfBranches=noOfBranch;
	System.out.println("constructor with two parameter==================================");
	
}

}
