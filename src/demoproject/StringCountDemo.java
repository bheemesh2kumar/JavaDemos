package demoproject;

public class StringCountDemo {
	
	static void Count(String str)
	{
		char chr[]=str.toCharArray();
		
		for(int i=0;i<chr.length;i++)
		{
			String strpint="";
			while(i<chr.length && chr[i] != ' ')
			{
				strpint=strpint+chr[i];
				i++;
		
				
				}
			
			
			if(strpint.length()>0)
			{
			
			System.out.println("the count of string vlaue" + "  " + strpint +   " >" +strpint.length() );
			}
				
		}
		
		
	}
	

	public static void main(String[] args) {
		
		String UserStr="Hello World How are you";
		Count(UserStr);
		
				
		
	}

}
