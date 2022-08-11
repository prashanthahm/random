class Chocolate {
        String name;
        String flavour;
     String brand;
        double price;
		

Date()

{
	
	System.out.println("default==================================");
}
Date(String name);
{
	this.name=name
	System.out.println("constructor 1==================================");
}

Date(String name,String flavour)

{
	this(name,month);
	
	this.flavour=flavour;
	System.out.println("constructor 2==================================");
}

Date(String name,String flavour,String brand)

{this(name,month);
	
	this.brand=brand;
	System.out.println("constructor 3==================================");
}

Date(String name,String flavour,String brand,double price)

{this(name,month,year);

	this.price=price;
	System.out.println("constructor 4==================================");
}

		
}