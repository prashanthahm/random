class Bag {
	static void carryItems(String[] items) 
	{
		for (int i = 0; i < items.length; i++) 
	{
	System.out.println("we are taking :"+items[i]);
	}
	
	}
	static void capacity(double inLiters) 
	{
		System.out.println("capacity of the bag is:"+inLiters);
		
	}
	static void properties(String color,double weight,String type,String brand) 
	{
		System.out.println("bag color:"+ color+"   bag weight :"+weight+"   Bag type:"+type+"  Bag Brand:"+brand);
        capacity(10d);
	}

}