package Com.Java.InterviewDemos;

import java.util.HashSet;

public class RemoveDuplicateString {
	
	
public static void  removeduplicates(String str)
{
	
	String revstr=" ";
	
	for(int i =0;i<str.length();i++)
		
	{
		char chr =str.charAt(i);
		HashSet<Character> hs=new HashSet<Character>();
		
		if (hs.add(chr)==false);
		{
			revstr=revstr+chr;
		}
		
		
	}
	
	System.out.println(revstr);
	
}

	public static void main(String[] args) {
		
	
		removeduplicates(bheemesh);
		
		

	}

}
