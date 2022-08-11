class PubPal {

	public static void main(String[] args) {
		
		Pub pub=new Pub();
		pub.name="ROADshow";
		pub.place="silkboard";
		pub.openTime=7.10;
		pub.entryFee=6836;
		
		System.out.println(pub.name);
		System.out.println(pub.place);
		System.out.println(pub.openTime);
		System.out.println(pub.entryFee);
		
		Pub pub1=new Pub();
		pub1.name="kingCorner";
		pub1.place="Jaynagar";
		pub1.openTime=3;
		pub1.entryFee=9000;
		
		System.out.println(pub1.name);
		System.out.println(pub1.place);
		System.out.println(pub1.openTime);
		System.out.println(pub1.entryFee);
		
		Pub pub2=new Pub();
		pub2.name="JP nagar";
		pub2.place="jp nagar";
		pub2.openTime=10;
		pub2.entryFee=9779;
		
		System.out.println(pub2.name);
		System.out.println(pub2.place);
		System.out.println(pub2.openTime);
		System.out.println(pub2.entryFee);
		
		Pub pub3=new Pub("carrumKing","wood");
		pub3.openTime=9.2;
		pub3.entryFee=8888;
		
		System.out.println(pub3.name);
		System.out.println(pub3.place);
		System.out.println(pub3.openTime);
		System.out.println(pub3.entryFee);
		
		Pub pub4=new Pub("lakeVIEW","HSR");
		pub4.openTime=8.0;
		pub4.entryFee=9999;
		
		System.out.println(pub4.name);
		System.out.println(pub4.place);
		System.out.println(pub4.openTime);
		System.out.println(pub4.entryFee);

	}

}