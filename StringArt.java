class StringArt
{
	public static void main(String[] args)
	{
		String str=new String();
		System.out.println(str);
		
	
		String string=new String("man");
		System.out.println(string);
		
		StringBuffer buffer=new StringBuffer("Bus");
		
		String string1=new String(buffer);
		System.out.println(string1);
		
		char[] value={'A','B','C','D'};
		String string2=new String(value);
		System.out.println(string2);
		
		byte[] bytes={65,66,72,73,72};
		
		String string3=new String(bytes);
		System.out.println(string3);
		
		int[] codePoints={12,8,9,3};
		
		String string4=new String(codePoints,0,4);
		System.out.println(string4);
		
	    String string5=new String(bytes,0,5);
		System.out.println(string5);
		
		StringBuilder builder=new StringBuilder("all");
		String string6=new String(builder);
		System.out.println(string6);
		
		char[] val={'B','A','L','L'};
		String string7=new String(val,0,4);
		System.out.println(string7);
	}
}