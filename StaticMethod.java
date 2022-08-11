class StaticMethod
{
	public static void main(String[] args)
	{
		String value=String.valueOf(69669054321987654l);
		System.out.println(value);
		
		String value1=String.valueOf('A');
		System.out.println(value1);
		
		char[] data={'t','B','C'};
		String value2=String.copyValueOf(data);
		System.out.println(value2);
		
		String value3=String.valueOf(true);
		System.out.println(value3);
		
		String value4=String.valueOf(6.6d);
		System.out.println(value4);
		
		char[] data1={'m','k','f'};
		String value5=String.valueOf(data1,0,2);
		System.out.println(value5);
	}
}