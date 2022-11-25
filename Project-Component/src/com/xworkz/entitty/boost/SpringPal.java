package com.xworkz.entitty.boost;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.entity.primary.Door;
import com.xworkz.entity.primary.Fan;
import com.xworkz.entity.primary.Human;
import com.xworkz.entity.primary.Light;
import com.xworkz.entity.primary.Wire;
import com.xworkz.entity.springconfi.SpringConfiguration;



public class SpringPal {

	public static void main(String[] args) {
		
ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		Door bean=context.getBean(Door.class);
		bean.security();
	
		
		System.out.println(context.getBean(Light.class).hashCode());
		
		System.out.println(context.getBean(Wire.class).hashCode());
		
		System.out.println(context.getBean(Fan.class).hashCode());
		
		System.out.println(context.getBean(Human.class).hashCode());
		
		System.out.println(context.getBean(Light.class).hashCode());
		
		System.out.println("-------------------------------------------------------------------------");
		
		System.out.println(context.getBean("name", String.class).hashCode());
		System.out.println(context.getBean("name1", String.class).hashCode());
		System.out.println(context.getBean("name2", String.class).hashCode());
		System.out.println(context.getBean("name3", String.class).hashCode());
		System.out.println(context.getBean("name4", String.class).hashCode());
		System.out.println(context.getBean("name5", String.class).hashCode());
		System.out.println(context.getBean("name6", String.class).hashCode());
		System.out.println(context.getBean("name7", String.class).hashCode());
		System.out.println(context.getBean("name8", String.class).hashCode());
		System.out.println(context.getBean("name9", String.class).hashCode());
		
		System.out.println("---------------------------------------------------------------------------");
		
		System.out.println(context.getBean("ca", String.class).hashCode());
		System.out.println(context.getBean("ca1", String.class).hashCode());
		System.out.println(context.getBean("ca2", String.class).hashCode());
		System.out.println(context.getBean("ca3", String.class).hashCode());
		System.out.println(context.getBean("ca4", String.class).hashCode());
		System.out.println(context.getBean("ca5", String.class).hashCode());
		System.out.println(context.getBean("ca6", String.class).hashCode());
		System.out.println(context.getBean("ca7", String.class).hashCode());
		System.out.println(context.getBean("ca8", String.class).hashCode());
		System.out.println(context.getBean("ca9", String.class).hashCode());
		
		System.out.println("-----------------------------------------------------------------------------");
		
		System.out.println(context.getBean("ca10", String.class).hashCode());
		System.out.println(context.getBean("ca11", String.class).hashCode());
		System.out.println(context.getBean("ca12", String.class).hashCode());
		System.out.println(context.getBean("ca13", String.class).hashCode());
		System.out.println(context.getBean("ca14", String.class).hashCode());
		System.out.println(context.getBean("ca15", String.class).hashCode());
		System.out.println(context.getBean("ca16", String.class).hashCode());
		System.out.println(context.getBean("ca17", String.class).hashCode());
		System.out.println(context.getBean("ca18", String.class).hashCode());
		System.out.println(context.getBean("ca19", String.class).hashCode());
		System.out.println(context.getBean("ca20", String.class).hashCode());
		System.out.println(context.getBean("ca21", String.class).hashCode());
		System.out.println(context.getBean("ca22", String.class).hashCode());
		System.out.println(context.getBean("ca23", String.class).hashCode());
		System.out.println(context.getBean("ca24", String.class).hashCode());
		System.out.println(context.getBean("ca25", String.class).hashCode());
		System.out.println(context.getBean("ca26", String.class).hashCode());
		System.out.println(context.getBean("ca27", String.class).hashCode());
		System.out.println(context.getBean("ca28", String.class).hashCode());
		System.out.println(context.getBean("ca29", String.class).hashCode());
		System.out.println(context.getBean("ca30", String.class).hashCode());
		System.out.println(context.getBean("ca31", String.class).hashCode());
		System.out.println(context.getBean("ca32", String.class).hashCode());
		System.out.println(context.getBean("ca33", String.class).hashCode());
		System.out.println(context.getBean("ca34", String.class).hashCode());
		System.out.println(context.getBean("ca35", String.class).hashCode());
		System.out.println(context.getBean("ca36", String.class).hashCode());
		System.out.println(context.getBean("ca37", String.class).hashCode());
		System.out.println(context.getBean("ca38", String.class).hashCode());
		System.out.println(context.getBean("ca39", String.class).hashCode());
		System.out.println(context.getBean("ca40", String.class).hashCode());
		System.out.println(context.getBean("ca41", String.class).hashCode());
		System.out.println(context.getBean("ca42", String.class).hashCode());
		System.out.println(context.getBean("ca43", String.class).hashCode());
		System.out.println(context.getBean("ca44", String.class).hashCode());
		System.out.println(context.getBean("ca45", String.class).hashCode());
		System.out.println(context.getBean("ca46", String.class).hashCode());
		System.out.println(context.getBean("ca47", String.class).hashCode());
		System.out.println(context.getBean("ca48", String.class).hashCode());
		System.out.println(context.getBean("ca49", String.class).hashCode());
		System.out.println(context.getBean("ca50", String.class).hashCode());
		
		System.out.println("----------------------------------------------------------------");
		
		System.out.println(context.getBean("bike1", Integer.class).hashCode());
		System.out.println(context.getBean("bike2", Integer.class).hashCode());
		System.out.println(context.getBean("bike3", Integer.class).hashCode());
		System.out.println(context.getBean("bike4", Integer.class).hashCode());
		System.out.println(context.getBean("bike5", Integer.class).hashCode());
		System.out.println(context.getBean("bike6", Integer.class).hashCode());
		System.out.println(context.getBean("bike7", Integer.class).hashCode());
		System.out.println(context.getBean("bike8", Integer.class).hashCode());
		System.out.println(context.getBean("bike9", Integer.class).hashCode());
		System.out.println(context.getBean("bike10", Integer.class).hashCode());
		System.out.println(context.getBean("bike11", Integer.class).hashCode());
		System.out.println(context.getBean("bike12", Integer.class).hashCode());
		System.out.println(context.getBean("bike13", Integer.class).hashCode());
		System.out.println(context.getBean("bike14", Integer.class).hashCode());
		System.out.println(context.getBean("bike15", Integer.class).hashCode());
		System.out.println(context.getBean("bike16", Integer.class).hashCode());
		System.out.println(context.getBean("bike17", Integer.class).hashCode());
		System.out.println(context.getBean("bike18", Integer.class).hashCode());
		System.out.println(context.getBean("bike19", Integer.class).hashCode());
		System.out.println(context.getBean("bike20", Integer.class));
		System.out.println(context.getBean("bike21", Integer.class).hashCode());
		System.out.println(context.getBean("bike22", Integer.class).hashCode());
		System.out.println(context.getBean("bike23", Integer.class).hashCode());
		System.out.println(context.getBean("bike24", Integer.class).hashCode());
		System.out.println(context.getBean("bike25", Integer.class).hashCode());
		System.out.println(context.getBean("bike26", Integer.class).hashCode());
		System.out.println(context.getBean("bike27", Integer.class).hashCode());
		System.out.println(context.getBean("bike28", Integer.class).hashCode());
		System.out.println(context.getBean("bike29", Integer.class).hashCode());
		System.out.println(context.getBean("bike30", Integer.class).hashCode());
		
		System.out.println("--------------------------------------------------------------");
		
		System.out.println(context.getBean("food1", Boolean.class).hashCode());
		System.out.println(context.getBean("food2", Boolean.class).hashCode());
		System.out.println(context.getBean("food3", Boolean.class).hashCode());
		System.out.println(context.getBean("food4", Boolean.class).hashCode());
		System.out.println(context.getBean("food5", Boolean.class));
	    System.out.println(context.getBean("food6", Boolean.class));
		System.out.println(context.getBean("food7", Boolean.class));
		System.out.println(context.getBean("food8", Boolean.class).hashCode());
		System.out.println(context.getBean("food9", Boolean.class).hashCode());
		System.out.println(context.getBean("food10", Boolean.class).hashCode());
		System.out.println(context.getBean("food11", Boolean.class).hashCode());
		System.out.println(context.getBean("food12", Boolean.class).hashCode());
		System.out.println(context.getBean("food13", Boolean.class).hashCode());
		System.out.println(context.getBean("food14", Boolean.class).hashCode());
		System.out.println(context.getBean("food15", Boolean.class).hashCode());
		System.out.println(context.getBean("food16", Boolean.class).hashCode());
		System.out.println(context.getBean("food17", Boolean.class).hashCode());
		System.out.println(context.getBean("food18", Boolean.class).hashCode());
		System.out.println(context.getBean("food19", Boolean.class).hashCode());
		System.out.println(context.getBean("food20", Boolean.class).hashCode());
		System.out.println(context.getBean("food21", Boolean.class).hashCode());
		System.out.println(context.getBean("food22", Boolean.class).hashCode());
		System.out.println(context.getBean("food23", Boolean.class).hashCode());
		System.out.println(context.getBean("food24", Boolean.class).hashCode());
		System.out.println(context.getBean("food25", Boolean.class).hashCode());
		
		System.out.println("--------------------------------------------------------------------------");
		
		System.out.println(context.getBean("distance1", float.class).hashCode());
		System.out.println(context.getBean("distance2", float.class).hashCode());
		System.out.println(context.getBean("distance3", float.class).hashCode());
		System.out.println(context.getBean("distance4", float.class));
		System.out.println(context.getBean("distance5", float.class).hashCode());
		System.out.println(context.getBean("distance6", float.class).hashCode());
		System.out.println(context.getBean("distance7", float.class).hashCode());
		System.out.println(context.getBean("distance8", float.class).hashCode());
		System.out.println(context.getBean("distance9", float.class).hashCode());
		System.out.println(context.getBean("distance10", float.class).hashCode());
		System.out.println(context.getBean("distance11", float.class).hashCode());
		System.out.println(context.getBean("distance12", float.class).hashCode());
		System.out.println(context.getBean("distance13", float.class).hashCode());
		System.out.println(context.getBean("distance14", float.class).hashCode());
		System.out.println(context.getBean("distance15", float.class).hashCode());
		System.out.println(context.getBean("distance16", float.class).hashCode());
		System.out.println(context.getBean("distance17", float.class).hashCode());
		System.out.println(context.getBean("distance18", float.class).hashCode());
		System.out.println(context.getBean("distance19", float.class).hashCode());
		System.out.println(context.getBean("distance20", float.class).hashCode());
		System.out.println(context.getBean("distance21", float.class).hashCode());
		System.out.println(context.getBean("distance22", float.class).hashCode());
		System.out.println(context.getBean("distance23", float.class).hashCode());
		System.out.println(context.getBean("distance24", float.class).hashCode());
		System.out.println(context.getBean("distance25", float.class).hashCode());
		System.out.println(context.getBean("distance26", float.class).hashCode());
		System.out.println(context.getBean("distance27", float.class).hashCode());
		System.out.println(context.getBean("distance28", float.class).hashCode());
		System.out.println(context.getBean("distance29", float.class).hashCode());
		System.out.println(context.getBean("distance30", float.class).hashCode());
		System.out.println(context.getBean("distance31", float.class).hashCode());
		System.out.println(context.getBean("distance32", float.class).hashCode());
		System.out.println(context.getBean("distance33", float.class).hashCode());
		System.out.println(context.getBean("distance34", float.class).hashCode());
		System.out.println(context.getBean("distance35", float.class).hashCode());
		System.out.println(context.getBean("distance36", float.class).hashCode());
		System.out.println(context.getBean("distance37", float.class).hashCode());
		System.out.println(context.getBean("distance38", float.class).hashCode());
		System.out.println(context.getBean("distance39", float.class).hashCode());
		System.out.println(context.getBean("distance40", float.class).hashCode());
		System.out.println(context.getBean("distance41", float.class).hashCode());
		System.out.println(context.getBean("distance42", float.class).hashCode());
		System.out.println(context.getBean("distance43", float.class).hashCode());
		System.out.println(context.getBean("distance44", float.class).hashCode());
		System.out.println(context.getBean("distance45", float.class).hashCode());
		System.out.println(context.getBean("distance46", float.class).hashCode());
		System.out.println(context.getBean("distance47", float.class).hashCode());
		System.out.println(context.getBean("distance48", float.class).hashCode());
		System.out.println(context.getBean("distance49", float.class).hashCode());
		System.out.println(context.getBean("distance50", float.class).hashCode());
		
	System.out.println("------------------------------------------------------------------------");
		
	    System.out.println(context.getBean("price1", double.class).hashCode());
	    System.out.println(context.getBean("price2", double.class).hashCode());
	    System.out.println(context.getBean("price3", double.class).hashCode());
	    System.out.println(context.getBean("price4", double.class).hashCode());
	    System.out.println(context.getBean("price5", double.class).hashCode());
	    System.out.println(context.getBean("price6", double.class).hashCode());
	    System.out.println(context.getBean("price7", double.class).hashCode());
	    System.out.println(context.getBean("price8", double.class).hashCode());
	    System.out.println(context.getBean("price9", double.class).hashCode()); 
	    System.out.println(context.getBean("price10", double.class).hashCode());
	    System.out.println(context.getBean("price11", double.class).hashCode());
	    System.out.println(context.getBean("price12", double.class).hashCode());
	    System.out.println(context.getBean("price13", double.class).hashCode());
	    System.out.println(context.getBean("price14", double.class).hashCode());
	    System.out.println(context.getBean("price15", double.class).hashCode());
	    System.out.println(context.getBean("price16", double.class).hashCode());
	    System.out.println(context.getBean("price17", double.class).hashCode());
	    System.out.println(context.getBean("price18", double.class).hashCode());
	    System.out.println(context.getBean("price19", double.class).hashCode());
	    System.out.println(context.getBean("price20", double.class).hashCode());
	    System.out.println(context.getBean("price21", double.class).hashCode());
	    System.out.println(context.getBean("price22", double.class).hashCode());
	    System.out.println(context.getBean("price23", double.class).hashCode());
	    System.out.println(context.getBean("price24", double.class).hashCode());
	    System.out.println(context.getBean("price25", double.class).hashCode());
	    System.out.println(context.getBean("price26", double.class).hashCode());
	    System.out.println(context.getBean("price27", double.class).hashCode());
	    System.out.println(context.getBean("price28", double.class).hashCode());
	    System.out.println(context.getBean("price29", double.class).hashCode()); 
	    System.out.println(context.getBean("price30", double.class).hashCode());
	    System.out.println(context.getBean("price31", double.class).hashCode());
	    System.out.println(context.getBean("price32", double.class).hashCode());
	    System.out.println(context.getBean("price33", double.class).hashCode());
	    System.out.println(context.getBean("price34", double.class).hashCode());
	    System.out.println(context.getBean("price35", double.class).hashCode());
	    System.out.println(context.getBean("price36", double.class).hashCode());
	    System.out.println(context.getBean("price37", double.class).hashCode());
	    System.out.println(context.getBean("price38", double.class).hashCode());
	    System.out.println(context.getBean("price39", double.class).hashCode());
	    System.out.println(context.getBean("price40", double.class).hashCode());
	    
	    System.out.println("------------------------------------------------------------------");
	    
	    System.out.println(context.getBean("kilometers1", boolean.class).hashCode());
	    System.out.println(context.getBean("kilometers2", boolean.class).hashCode());
	    System.out.println(context.getBean("kilometers3", boolean.class).hashCode());
	    System.out.println(context.getBean("kilometers4", boolean.class).hashCode());
	    System.out.println(context.getBean("kilometers5", boolean.class).hashCode());
	    System.out.println(context.getBean("kilometers6", boolean.class).hashCode());
	    System.out.println(context.getBean("kilometers7", boolean.class).hashCode());
	    System.out.println(context.getBean("kilometers8", boolean.class).hashCode());
	    System.out.println(context.getBean("kilometers9", boolean.class).hashCode());
	    System.out.println(context.getBean("kilometers10", boolean.class).hashCode());
	    System.out.println(context.getBean("kilometers11", boolean.class).hashCode());
	    System.out.println(context.getBean("kilometers12", boolean.class).hashCode());
	    System.out.println(context.getBean("kilometers13", boolean.class).hashCode());
	    System.out.println(context.getBean("kilometers14", boolean.class).hashCode());
	    System.out.println(context.getBean("kilometers15", boolean.class).hashCode());
	    System.out.println(context.getBean("kilometers16", boolean.class).hashCode());
	    System.out.println(context.getBean("kilometers17", boolean.class).hashCode());
	    System.out.println(context.getBean("kilometers18", boolean.class).hashCode());
	    System.out.println(context.getBean("kilometers19", boolean.class).hashCode());
	    System.out.println(context.getBean("kilometers20", boolean.class).hashCode());
	    System.out.println(context.getBean("kilometers21", boolean.class).hashCode());
	    System.out.println(context.getBean("kilometers22", boolean.class).hashCode());
	    System.out.println(context.getBean("kilometers23", boolean.class).hashCode());
	    System.out.println(context.getBean("kilometers24", boolean.class).hashCode());
	    System.out.println(context.getBean("kilometers25", boolean.class).hashCode());
	    System.out.println(context.getBean("kilometers26", boolean.class).hashCode());
	    System.out.println(context.getBean("kilometers27", boolean.class).hashCode());
	    System.out.println(context.getBean("kilometers28", boolean.class).hashCode());
	    System.out.println(context.getBean("kilometers29", boolean.class).hashCode());
	    System.out.println(context.getBean("kilometers30", boolean.class).hashCode());
	    System.out.println(context.getBean("kilometers31", boolean.class).hashCode());
	    System.out.println(context.getBean("kilometers32", boolean.class).hashCode());
	    System.out.println(context.getBean("kilometers33", boolean.class).hashCode());
	    System.out.println(context.getBean("kilometers34", boolean.class).hashCode());
	    System.out.println(context.getBean("kilometers35", boolean.class).hashCode());
	    System.out.println(context.getBean("kilometers36", boolean.class).hashCode());
	    System.out.println(context.getBean("kilometers37", boolean.class).hashCode());
	    System.out.println(context.getBean("kilometers38", boolean.class).hashCode());
	    System.out.println(context.getBean("kilometers39", boolean.class).hashCode());
	    System.out.println(context.getBean("kilometers40", boolean.class).hashCode());
	    System.out.println(context.getBean("kilometers41", boolean.class).hashCode());
	    System.out.println(context.getBean("kilometers42", boolean.class).hashCode());
	    System.out.println(context.getBean("kilometers43", boolean.class).hashCode());
	    System.out.println(context.getBean("kilometers44", boolean.class).hashCode());
	    System.out.println(context.getBean("kilometers45", boolean.class).hashCode());
	    System.out.println(context.getBean("kilometers46", boolean.class).hashCode());
	    System.out.println(context.getBean("kilometers47", boolean.class).hashCode());
	    System.out.println(context.getBean("kilometers48", boolean.class).hashCode());
	    System.out.println(context.getBean("kilometers49", boolean.class).hashCode());
	    System.out.println(context.getBean("kilometers50", boolean.class).hashCode());
	    
	    System.out.println("-------------------------------------------------------------------");
	    
	    System.out.println(context.getBean("distance51", float.class).hashCode());
		System.out.println(context.getBean("distance52", float.class).hashCode());
		System.out.println(context.getBean("distance53", float.class).hashCode());
		System.out.println(context.getBean("distance54", float.class));
		System.out.println(context.getBean("distance55", float.class).hashCode());
		System.out.println(context.getBean("distance56", float.class).hashCode());
		System.out.println(context.getBean("distance57", float.class).hashCode());
		System.out.println(context.getBean("distance58", float.class).hashCode());
		System.out.println(context.getBean("distance59", float.class).hashCode());
		System.out.println(context.getBean("distance60", float.class).hashCode());
		System.out.println(context.getBean("distance61", float.class).hashCode());
		System.out.println(context.getBean("distance62", float.class).hashCode());
		System.out.println(context.getBean("distance63", float.class).hashCode());
		System.out.println(context.getBean("distance64", float.class).hashCode());
		System.out.println(context.getBean("distance65", float.class).hashCode());
		System.out.println(context.getBean("distance66", float.class).hashCode());
		System.out.println(context.getBean("distance67", float.class).hashCode());
		System.out.println(context.getBean("distance68", float.class).hashCode());
		System.out.println(context.getBean("distance69", float.class).hashCode());
		System.out.println(context.getBean("distance70", float.class).hashCode());
		System.out.println(context.getBean("distance71", float.class).hashCode());
		System.out.println(context.getBean("distance72", float.class).hashCode());
		System.out.println(context.getBean("distance73", float.class).hashCode());
		System.out.println(context.getBean("distance74", float.class).hashCode());
		System.out.println(context.getBean("distance75", float.class).hashCode());
		System.out.println(context.getBean("distance76", float.class).hashCode());
		System.out.println(context.getBean("distance77", float.class).hashCode());
		System.out.println(context.getBean("distance78", float.class).hashCode());
		System.out.println(context.getBean("distance79", float.class).hashCode());
		System.out.println(context.getBean("distance80", float.class).hashCode());
		System.out.println(context.getBean("distance81", float.class).hashCode());
		System.out.println(context.getBean("distance82", float.class).hashCode());
		System.out.println(context.getBean("distance83", float.class).hashCode());
		System.out.println(context.getBean("distance84", float.class).hashCode());
		System.out.println(context.getBean("distance85", float.class).hashCode());
		System.out.println(context.getBean("distance86", float.class).hashCode());
		System.out.println(context.getBean("distance87", float.class).hashCode());
		System.out.println(context.getBean("distance88", float.class).hashCode());
		System.out.println(context.getBean("distance89", float.class).hashCode());
		System.out.println(context.getBean("distance90", float.class).hashCode());
		System.out.println(context.getBean("distance91", float.class).hashCode());
		System.out.println(context.getBean("distance92", float.class).hashCode());
		System.out.println(context.getBean("distance93", float.class).hashCode());
		System.out.println(context.getBean("distance94", float.class).hashCode());
		System.out.println(context.getBean("distance95", float.class).hashCode());
		System.out.println(context.getBean("distance96", float.class).hashCode());
		System.out.println(context.getBean("distance97", float.class).hashCode());
		System.out.println(context.getBean("distance98", float.class).hashCode());
		System.out.println(context.getBean("distance99", float.class).hashCode());
		System.out.println(context.getBean("distance100", float.class).hashCode());
	    
		System.out.println("------------------------------------------------------------------");
		
		System.out.println(context.getBean("carOwnerName1",String.class).hashCode());
		System.out.println(context.getBean("carOwnerName2",String.class).hashCode());
		System.out.println(context.getBean("carOwnerName3",String.class).hashCode());
		System.out.println(context.getBean("carOwnerName4",String.class).hashCode());
		System.out.println(context.getBean("carOwnerName5",String.class).hashCode());
		System.out.println(context.getBean("carOwnerName6",String.class).hashCode());
		System.out.println(context.getBean("carOwnerName7",String.class).hashCode());
		System.out.println(context.getBean("carOwnerName8",String.class).hashCode());
		System.out.println(context.getBean("carOwnerName9",String.class).hashCode());
		System.out.println(context.getBean("carOwnerName10",String.class).hashCode());
		System.out.println(context.getBean("carOwnerName11",String.class).hashCode());
		System.out.println(context.getBean("carOwnerName12",String.class).hashCode());
		System.out.println(context.getBean("carOwnerName13",String.class).hashCode());
		System.out.println(context.getBean("carOwnerName14",String.class).hashCode());
		System.out.println(context.getBean("carOwnerName15",String.class).hashCode());
		System.out.println(context.getBean("carOwnerName16",String.class).hashCode());
		System.out.println(context.getBean("carOwnerName17",String.class).hashCode());
		System.out.println(context.getBean("carOwnerName18",String.class).hashCode());
		System.out.println(context.getBean("carOwnerName19",String.class).hashCode());
		System.out.println(context.getBean("carOwnerName20",String.class).hashCode());
		System.out.println(context.getBean("carOwnerName21",String.class).hashCode());
		System.out.println(context.getBean("carOwnerName22",String.class).hashCode());
		System.out.println(context.getBean("carOwnerName23",String.class).hashCode());
		System.out.println(context.getBean("carOwnerName24",String.class).hashCode());
		System.out.println(context.getBean("carOwnerName25",String.class).hashCode());
		System.out.println(context.getBean("carOwnerName26",String.class).hashCode());
		System.out.println(context.getBean("carOwnerName27",String.class).hashCode());
		System.out.println(context.getBean("carOwnerName28",String.class).hashCode());
		System.out.println(context.getBean("carOwnerName29",String.class).hashCode());
		System.out.println(context.getBean("carOwnerName30",String.class).hashCode());
		System.out.println(context.getBean("carOwnerName31",String.class).hashCode());
		System.out.println(context.getBean("carOwnerName32",String.class).hashCode());
		System.out.println(context.getBean("carOwnerName33",String.class).hashCode());
		System.out.println(context.getBean("carOwnerName34",String.class).hashCode());
		System.out.println(context.getBean("carOwnerName35",String.class).hashCode());
		System.out.println(context.getBean("carOwnerName36",String.class).hashCode());
		System.out.println(context.getBean("carOwnerName37",String.class).hashCode());
		System.out.println(context.getBean("carOwnerName38",String.class).hashCode());
		System.out.println(context.getBean("carOwnerName39",String.class).hashCode());
		System.out.println(context.getBean("carOwnerName40",String.class).hashCode());
		
		System.out.println("-------------------------------------------------------------------");
		
		System.out.println(context.getBean("grade1",char.class).hashCode());
		System.out.println(context.getBean("grade2",char.class).hashCode());
		System.out.println(context.getBean("grade3",char.class).hashCode());
		System.out.println(context.getBean("grade4",char.class).hashCode());
		System.out.println(context.getBean("grade5",char.class).hashCode());
		System.out.println(context.getBean("grade6",char.class).hashCode());
		System.out.println(context.getBean("grade7",char.class).hashCode());
		System.out.println(context.getBean("grade8",char.class).hashCode());
		System.out.println(context.getBean("grade9",char.class).hashCode());
		System.out.println(context.getBean("grade10",char.class).hashCode());
		System.out.println(context.getBean("grade11",char.class).hashCode());
		System.out.println(context.getBean("grade12",char.class).hashCode());
		System.out.println(context.getBean("grade13",char.class).hashCode());
		System.out.println(context.getBean("grade14",char.class).hashCode());
		System.out.println(context.getBean("grade15",char.class).hashCode());
		System.out.println(context.getBean("grade16",char.class).hashCode());
		System.out.println(context.getBean("grade17",char.class).hashCode());
		System.out.println(context.getBean("grade18",char.class).hashCode());
		System.out.println(context.getBean("grade19",char.class).hashCode());
		System.out.println(context.getBean("grade20",char.class).hashCode());
	
		
		
	   }
	}


