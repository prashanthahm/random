class SignalPal{

public static void main (String[] arges)
{

Signal sign=new Signal();
System.out.println(sign.whereThePlace);
System.out.println(sign.hightOfPoleSignal);
System.out.println(sign.cityName);
System.out.println(sign.noOfLightsInSignal);
System.out.println(sign.noOfSignalInCircle);
System.out.println(sign.conditionOfSignalGood);
System.out.println(sign.rateOfSignal);
System.out.println(sign.stregthOfSignal);


System.out.println("Re instantiation=====================================");

sign.whereThePlace="KR Circle";
sign.hightOfPoleSignal=8;
sign.cityName="Banglore";
sign.noOfLightsInSignal=3;
sign.noOfSignalInCircle=4;
sign.conditionOfSignalGood=true;
sign.rateOfSignal='A';
sign.stregthOfSignal='H';

System.out.println(sign.whereThePlace);
System.out.println(sign.hightOfPoleSignal +"M");
System.out.println(sign.cityName);
System.out.println(sign.noOfLightsInSignal);
System.out.println(sign.noOfSignalInCircle);
System.out.println(sign.conditionOfSignalGood);
System.out.println(sign.rateOfSignal);
System.out.println(sign.stregthOfSignal);


}

}