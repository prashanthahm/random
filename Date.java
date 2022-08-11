class Date {
        int day;
        int month;
        int year;
        String days;
		

Date()

{
	
	System.out.println("default==================================");
}

Date(int day)
{
	this();
	this.day=day;
	System.out.println("constructor 1==================================");
}

Date(int day,int month)

{
	this(day);
	this.day=day;
	this.month=month;
	System.out.println("constructor 2==================================");
}

Date(int day,int month,int year)

{this(day,month);
	this.day=day;
	this.month=month;
	this.year=year;
	System.out.println("constructor 3==================================");
}

Date(int day,int month,int year,String days)

{this(day,month,year);
	this.day=day;
	this.month=month;
	this.year=year;
	this.days=days;
	System.out.println("constructor 4==================================");
}

		
}