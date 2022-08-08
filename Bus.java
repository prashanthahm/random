class Bus 
{
static void	busId(int Number) {
	System.out.println("BusID::"+Number);
	
}
static void	combinatinColor(String colur,String color) {
	System.out.println("Bus combination colr="+color+"   and  "+colur);
}
static void busSize(int lenght, int hight, int width) {
	System.out.println("bus dimension in meter ::"+lenght+"X"+hight+"X"+width);
}
static void eachTyrePressure(double frontRight,double frontLeft,double backRight,double backLeft ){
	System.out.println("eachTyrePressure");
	System.out.println("front right::"+frontRight);
	System.out.println("front left::"+frontLeft);
	System.out.println("back right::"+backRight);
	System.out.println("back left::"+backLeft);
}
static void speedOfMinimumRPM(int firstgear,int secondgear,int thirdgear,int forthgear, int fifthgear) {
	System.out.println("speedOfMinimumRPM");
	System.out.println("speed at firstgear"+firstgear);
	System.out.println("speed at secondgear"+secondgear);
	System.out.println("speed at thirdgear"+thirdgear);
	System.out.println("speed at forthgear"+forthgear);
	System.out.println("speed at fifthgear"+fifthgear);
}
static void specfictionOfBus(int numberOfseat,int numberOfDoor,int wiper,int windows,String engineType,int mirror) {
System.out.println("specfictionOfBus");
System.out.println("numberOfseat "+numberOfseat);
System.out.println("numberOfDoor "+numberOfDoor);
System.out.println("wiper  "+wiper);
System.out.println("windows "+windows);
System.out.println("engineType "+engineType);
System.out.println("mirror  "+mirror);
}
}