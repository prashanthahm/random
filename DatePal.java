class DatePal{

public static void main(String[] arges)
{

Date date=new Date();
System.out.println(date.day);
System.out.println(date.month);
System.out.println(date.year);
System.out.println(date.days);

Date date1=new Date(11);
   
   date1.month=8;
   date1.year=2022;
   date1.days="twenty twenty two";
		
System.out.println(date1.day);
System.out.println(date1.month);
System.out.println(date1.year);
System.out.println(date1.days);

Date date2=new Date(12,9);

   date2.year=2022;
   date2.days="twenty twenty two";
System.out.println(date2.day);
System.out.println(date2.month);
System.out.println(date2.year);
System.out.println(date2.days);

Date date3=new Date(12,9,2023);

   date3.days="twenty twenty two";
   
   System.out.println(date3.day);
System.out.println(date3.month);
System.out.println(date3.year);
System.out.println(date3.days);

Date date4=new Date(14,10,2024,"twenty twnty five");

System.out.println(date4.day);
System.out.println(date4.month);
System.out.println(date4.year);
System.out.println(date4.days);

}

}
