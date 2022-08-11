class IceCream{
	
    String flavour;
    double price;
    String type;
    String color;
    String brand;
    double weight;
    double quantity;
    boolean dryFruit;
    boolean goodTaste;
    int since;
	
	IceCream()
	{
		System.out.println("default==================================");
	}
	
	IceCream(String flavour)
	{this();
		this.flavour=flavour;
		System.out.println("constructor1==================================");
	}
	IceCream(String flavour,double price)
	{this(flavour);
		this.price=price;
		System.out.println("constructor2==================================");
	}
	IceCream(String flavour,double price,String type)
	{
		this(flavour,price);
		this.type=type;
		System.out.println("constructor3==================================");
	}
	IceCream(String flavour,double price,String type,String color)
	{this(flavour,price);
		this.color=color;
		System.out.println("constructor4==================================");
	}
	IceCream(String flavour,double price,String type,String color,String brand)
	{
		this(flavour,price,type,color);
		this.brand=brand;
		System.out.println("constructor5==================================");
	}
	IceCream(String flavour,double price,String type,String color,String brand,double weight)
	{
		this(flavour,price,type,color,brand);
		
		this.weight=weight;
		System.out.println("constructor6==================================");
	}
	IceCream(String flavour,double price,String type,String color,String brand,double weight,double quantity)
	{
		this(flavour,price,type,color,brand,weight);
		
		this.quantity=quantity;
		System.out.println("constructor7==================================");
	}
	IceCream(String flavour,double price,String type,String color,String brand,double weight,double quantity,boolean dryFruit)
	{
		this(flavour,price,type,color,brand,weight,quantity);
	
		this.dryFruit=dryFruit;
		System.out.println("constructor8==================================");
	}
	IceCream(String flavour,double price,String type,String color,String brand,double weight,
	double quantity,boolean dryFruit,boolean goodTaste)
	{
		this(flavour,price,type,color,brand,weight,
	quantity,dryFruit);
		
		this.goodTaste=goodTaste;
		System.out.println("constructor9==================================");
	}
	IceCream(String flavour,double price,String type,String color,String brand,double weight,
	double quantity,boolean dryFruit,boolean goodTaste,int since)
	{
		this(flavour,price,type,color,brand,weight,
	quantity,dryFruit,goodTaste);
		
		this.since=since;
		System.out.println("constructor10==================================");
	}
	
}