class BiscuitPal{

public static void main(String[] arges){

IceCream iceCream=new IceCream();
System.out.println(iceCream.flavour);
System.out.println(iceCream.price);
System.out.println(iceCream.type);
System.out.println(iceCream.color);
System.out.println(iceCream.brand);
System.out.println(iceCream.weight);
System.out.println(iceCream.quantity);
System.out.println(iceCream.dryFruit);
System.out.println(iceCream.goodTaste);
System.out.println(iceCream.since);

IceCream iceCream1=new IceCream("Vanilla");

iceCream1.price=50;
iceCream1.type="cone";
iceCream1.color="Purple";
iceCream1.brand="Ben&Jerry's";
iceCream1.weight=25;
iceCream1.quantity=4;
iceCream1.dryFruit=true;
iceCream1.goodTaste=true;
iceCream1.since=1998;

System.out.println(iceCream1.flavour);
System.out.println(iceCream1.price);
System.out.println(iceCream1.type);
System.out.println(iceCream1.color);
System.out.println(iceCream1.brand);
System.out.println(iceCream1.weight);
System.out.println(iceCream1.quantity);
System.out.println(iceCream1.dryFruit);
System.out.println(iceCream1.goodTaste);
System.out.println(iceCream1.since);

IceCream iceCream2=new IceCream("Vanilla",75);

iceCream2.type="cup";
iceCream2.color="orange";
iceCream2.brand="Ben&Jerry's";
iceCream2.weight=25;
iceCream2.quantity=5;
iceCream2.dryFruit=true;
iceCream2.goodTaste=true;
iceCream2.since=1998;

System.out.println(iceCream2.flavour);
System.out.println(iceCream2.price);
System.out.println(iceCream2.type);
System.out.println(iceCream2.color);
System.out.println(iceCream2.brand);
System.out.println(iceCream2.weight);
System.out.println(iceCream2.quantity);
System.out.println(iceCream2.dryFruit);
System.out.println(iceCream2.goodTaste);
System.out.println(iceCream2.since);

IceCream iceCream3=new IceCream("Vanilla",78,"Random");

iceCream3.color="blue";
iceCream3.brand="Ben&Jerry's";
iceCream3.weight=27;
iceCream3.quantity=6;
iceCream3.dryFruit=false;
iceCream3.goodTaste=true;
iceCream3.since=1998;

System.out.println(iceCream3.flavour);
System.out.println(iceCream3.price);
System.out.println(iceCream3.type);
System.out.println(iceCream3.color);
System.out.println(iceCream3.brand);
System.out.println(iceCream3.weight);
System.out.println(iceCream3.quantity);
System.out.println(iceCream3.dryFruit);
System.out.println(iceCream3.goodTaste);
System.out.println(iceCream3.since);

IceCream iceCream4=new IceCream("Strawberry",78,"Random","orange");

iceCream4.brand="Ben&Jerry's";
iceCream4.weight=27;
iceCream4.quantity=6;
iceCream4.dryFruit=false;
iceCream4.goodTaste=true;
iceCream4.since=1999;

System.out.println(iceCream4.flavour);
System.out.println(iceCream4.price);
System.out.println(iceCream4.type);
System.out.println(iceCream4.color);
System.out.println(iceCream4.brand);
System.out.println(iceCream4.weight);
System.out.println(iceCream4.quantity);
System.out.println(iceCream4.dryFruit);
System.out.println(iceCream4.goodTaste);
System.out.println(iceCream4.since);

IceCream iceCream5=new IceCream("Strawberry",100,"Random","orange","Ben");


iceCream5.weight=30;
iceCream5.quantity=6;
iceCream5.dryFruit=false;
iceCream5.goodTaste=false;
iceCream5.since=2000;

System.out.println(iceCream5.flavour);
System.out.println(iceCream5.price);
System.out.println(iceCream5.type);
System.out.println(iceCream5.color);
System.out.println(iceCream5.brand);
System.out.println(iceCream5.weight);
System.out.println(iceCream5.quantity);
System.out.println(iceCream5.dryFruit);
System.out.println(iceCream5.goodTaste);
System.out.println(iceCream5.since);

IceCream iceCream6=new IceCream("Cream",100,"cup","orange","Ben",40);

iceCream6.quantity=7;
iceCream6.dryFruit=false;
iceCream6.goodTaste=true;
iceCream6.since=2000;

System.out.println(iceCream6.flavour);
System.out.println(iceCream6.price);
System.out.println(iceCream6.type);
System.out.println(iceCream6.color);
System.out.println(iceCream6.brand);
System.out.println(iceCream6.weight);
System.out.println(iceCream6.quantity);
System.out.println(iceCream6.dryFruit);
System.out.println(iceCream6.goodTaste);
System.out.println(iceCream6.since);

IceCream iceCream7=new IceCream("Cream",100,"cup","White","Ben",40,8);

iceCream7.dryFruit=true;
iceCream7.goodTaste=true;
iceCream7.since=2002;

System.out.println(iceCream7.flavour);
System.out.println(iceCream7.price);
System.out.println(iceCream7.type);
System.out.println(iceCream7.color);
System.out.println(iceCream7.brand);
System.out.println(iceCream7.weight);
System.out.println(iceCream7.quantity);
System.out.println(iceCream7.dryFruit);
System.out.println(iceCream7.goodTaste);
System.out.println(iceCream7.since);

IceCream iceCream8=new IceCream("Cream",100,"cup","White","Ben",40,8,false);

iceCream8.goodTaste=true;
iceCream8.since=2002;

System.out.println(iceCream8.flavour);
System.out.println(iceCream8.price);
System.out.println(iceCream8.type);
System.out.println(iceCream8.color);
System.out.println(iceCream8.brand);
System.out.println(iceCream8.weight);
System.out.println(iceCream8.quantity);
System.out.println(iceCream8.dryFruit);
System.out.println(iceCream8.goodTaste);
System.out.println(iceCream8.since);

IceCream iceCream9=new IceCream("Cake",60,"Round","White","Ben",40,6,false,false);

iceCream9.since=2012;

System.out.println(iceCream9.flavour);
System.out.println(iceCream9.price);
System.out.println(iceCream9.type);
System.out.println(iceCream9.color);
System.out.println(iceCream9.brand);
System.out.println(iceCream9.weight);
System.out.println(iceCream9.quantity);
System.out.println(iceCream9.dryFruit);
System.out.println(iceCream9.goodTaste);
System.out.println(iceCream9.since);

IceCream iceCream10=new IceCream("Cake",60,"Round","Creamy","Ben",45,6,true,true,2015);

System.out.println(iceCream10.flavour);
System.out.println(iceCream10.price);
System.out.println(iceCream10.type);
System.out.println(iceCream10.color);
System.out.println(iceCream10.brand);
System.out.println(iceCream10.weight);
System.out.println(iceCream10.quantity);
System.out.println(iceCream10.dryFruit);
System.out.println(iceCream10.goodTaste);
System.out.println(iceCream10.since);
}

}