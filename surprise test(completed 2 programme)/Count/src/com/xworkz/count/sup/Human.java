package com.xworkz.count.sup;

public class Human {

	public static void main(String[] args) {
	
		String name="prashantha";
		char cha='n';
		int count=0;
		for (int i=0; i<name.length();i++)
		{
			if(name.charAt(i)==cha)
				count++;
		}
		System.out.println(cha+"\t"+ "total is "+count);
		}
	
		}

	


