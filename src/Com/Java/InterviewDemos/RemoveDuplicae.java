package Com.Java.InterviewDemos;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicae {

	public static void main(String[] args) {
		
		
		String Message="Bhavishni";
		RemoveDuplicate(Message);
		
	
	}
	
	public static void RemoveDuplicate(String Str)
	{
		
	Set<Character> setvalue=new HashSet<>();
	StringBuffer sb=new StringBuffer();
	
	for(int i=0;i<Str.length();i++)
	{
		char ch=Str.charAt(i);
		
		if(!setvalue.contains(ch))
		{
			setvalue.add(ch);
			sb.append(ch);
		}
	}
	
	System.out.println("Removed String is " +sb );
		
	}
	

}
