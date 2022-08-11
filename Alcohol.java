class Alcohol{

static String shopInCity="Banglore";
String placeOfAlcohol="Rajaji Nagar";
String nameOfAlcohol="raj";
//String placeOfAlcohol="raj";

int noOfBranches=9;

Alcohol()
{
	System.out.println("==================================");
}

Alcohol(String placeOfSho, int noOfBranch )
{
	placeOfAlcohol=placeOfSho;
	noOfBranches=noOfBranch;
	System.out.println("constructor with two parameter==================================");
	
}

}
